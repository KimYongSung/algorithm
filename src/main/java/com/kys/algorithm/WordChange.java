package com.kys.algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class WordChange {
   
    public int solution(String begin, String target, String[] words) {

        int length          = words.length, answer = 0;
        boolean[] visit     = new boolean[length];
        Queue<Word> queue   = new LinkedList<>();

        queue.add(new Word(begin, 0));

        while (!queue.isEmpty()) {

            Word word = queue.poll();

            if(target.equals(word.next)){
                answer = word.getSeq();
                break;
            }

            for (int i = 0; i < length; i++) {
                if(!visit[i] && isNext(word.next, words[i])){
                    visit[i] = true;
                    queue.add(word.toNext(words[i]));
                }
            }
        }

        return answer;
    }

    /**
     * word와 begin의 유사성 검사
     */
    private boolean isNext(String word, String begin){

        for(int index = 0, hitCount = 0; index < word.length(); index++){
            if(word.charAt(index) != begin.charAt(index)) {
                if(++hitCount > 1){
                    return  false;
                }
            }
        }

        return true;
    }

    /**
     * Word 관리
     */
    class Word {

        private final String next;
        private final int seq;

        public Word(String next, int seq) {
            this.next = next;
            this.seq = seq;
        }

        public int nextSeq(){
            return this.seq + 1;
        }

        public int getSeq(){
            return this.seq;
        }

        public Word toNext(String next){
            return new Word(next, seq+1);
        }
    }
}