package com.kys.algorithm.bfs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Collectors;

public class Test01 {

    public int solution(String[] A) {
        // write your code in Java SE 8
        int max = 0;
        int length = A.length;

        Word first = new Word(A[0], length);
        first.update(0);

        Queue<Word> queue = new LinkedList<>();
        queue.add(first);

        while (!queue.isEmpty()){

            Word curr = queue.poll();

            if(curr.isUse())
                max = Math.max(max, curr.getLength());

            for (int i = 0; i < length; i++) {

                if(curr.isVisit(i))
                    continue;

                Word word = new Word(A[i], length);

                if(!word.isUse() || curr.isContains(word))
                    continue;

                queue.add(curr.next(word, i));
            }
        }

        return max;
    }

    public class Word{

        private final String value;

        private final Set<Character> characters;

        private final boolean[] visit;

        public Word(String value, int size) {
            this.value = value;
            this.visit = new boolean[size];
            characters = value.chars()
                              .mapToObj(i -> new Character((char) i))
                              .collect(Collectors.toSet());
        }

        public int getLength(){
            return value.length();
        }

        public boolean isUse(){
            return value.length() == characters.size();
        }

        private Word(String value, Set<Character> characters, boolean[] visit) {
            this.value = value;
            this.characters = characters;
            this.visit = visit;
        }

        public boolean isContains(Word ch){
            return ch.characters
                     .stream()
                     .anyMatch(c -> this.characters.contains(c));
        }

        public void update(int index){
            visit[index] = true;
        }

        public boolean isVisit(int index){
            return visit[index];
        }

        public Word next(Word word, int visitIndex){
            boolean[] newVisit = Arrays.copyOf(visit, visit.length);
            newVisit[visitIndex] = true;

            Set<Character> newSet = new HashSet<>();
            newSet.addAll(characters);
            newSet.addAll(word.characters);

            return new Word(this.value + word.value, newSet, newVisit);
        }
    }
}
