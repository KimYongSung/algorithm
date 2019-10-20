package com.kys.algorithm.kakao;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class FindLyric {

    public static final int ALPHABET_SIZE = 26;

    public static final int MAX_WORD_LENGTH = 10000;

    public static final char WILDCARD = '?';

    public static final int ASCII_a = 97;

    public int[] solution(String[] words, String[] queries){

        Dictionary dictionary = new Dictionary(false);
        Dictionary reverseDictionary = new Dictionary(true);

        for (String word: words) {
            dictionary.addWord(word);
            reverseDictionary.addWord(word);
        }

        int[] results = new int[queries.length];
        Map<String, Integer> cache = new HashMap<>();

        for (int i = 0; i < queries.length; i++) {

            String query = queries[i];

            Integer result = cache.get(query);

            if(Objects.isNull(result)){
                result = query.charAt(0) == WILDCARD ? reverseDictionary.findNumberOfMatch(query) : dictionary.findNumberOfMatch(query);
                cache.put(query, result);
            }
            results[i] = result;
        }

        return results;
    }

    /**
     * 사전 정보
     */
    class Dictionary{

        private final Map<Integer , Map<Character, Word>> words;

        private final boolean isReverse;

        public Dictionary(boolean isReverse) {
            this.words = new HashMap<>();
            this.isReverse = isReverse;
        }

        public void addWord(String word){
            int index = word.length();
            word = init(word);

            Map<Character, Word> words = this.words.get(index);

            if(Objects.isNull(words)){
                words = new HashMap<>();
                this.words.put(index, words);
            }

            char ch = word.charAt(0);
            Word curr = words.get(ch);

            if(Objects.isNull(curr)){
                curr = new Word(ch);
                words.put(ch, curr);
            }

            addWord(word, 1, curr);
        }

        private void addWord(String word, int start, Word curr) {
            if(start < word.length())
                addWord(word, start+1, curr.addChild(word.charAt(start)));
        }

        /**
         * 일치하는 문자열 갯수
         * @param query
         * @return
         */
        public int findNumberOfMatch(String query){

            int index = query.length();
            query = init(query);

            if(query.charAt(0) == WILDCARD){
                return findNumberOfAllMatch(index);
            }

            Map<Character, Word> words = this.words.get(index);

            if(Objects.isNull(words)){
                return 0;
            }

            Word curr = findWord(query, words.get(query.charAt(0)));

            return Objects.isNull(curr) ? 0 : curr.getWordCount();
        }

        private Word findWord(String query, Word word) {
            for (int i = 1; i < query.length() && word != null; i++) {
                char ch = query.charAt(i);

                if(ch == WILDCARD){
                    break;
                }

                word = word.next(ch);
            }

            return word;
        }

        /**
         * 해당 자릿수의 모든 문자열 갯수
         * @param index
         * @return
         */
        private int findNumberOfAllMatch(int index) {
            return this.words.get(index)
                             .values()
                             .stream()
                             .mapToInt(Word::getWordCount)
                             .sum();
        }

        private String init(String str) {
            return isReverse ? reverse(str) : str;
        }

        private String reverse(String word){
            return new StringBuilder(word).reverse().toString();
        }
    }

    class Word {

        private final char ch;

        private int wordCount = 0;

        private Map<Character, Word> child = null;

        public Word(char ch) {
            this.ch = ch;
        }

        /**
         * 자식 문자열 추가
         * @param ch
         * @return
         */
        public Word addChild(char ch){

            int index = ch - ASCII_a;

            if(Objects.isNull(child)){
                child = new HashMap<>();
            }

            Word word = child.get(ch);

            if(Objects.isNull(word)){
                word = new Word(ch);
                child.put(ch, word);
            }

            wordCount++;

            return word;
        }

        public int getWordCount(){
            return this.wordCount;
        }

        public Word next(char ch){

            if(Objects.isNull(child)){
                return null;
            }

            return child.get(ch);
        }
    }

}