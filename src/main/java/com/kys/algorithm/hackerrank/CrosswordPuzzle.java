package com.kys.algorithm.hackerrank;

public class CrosswordPuzzle {

    // Complete the crosswordPuzzle function below.
    static String[] crosswordPuzzle(String[] crossword, String words) {



        return null;
    }

    class Puzzle{
        private final String[] words;
        private final String[] crossword;

        public Puzzle(String[] words, String crossword) {
            this.words = words;
            this.crossword = crossword.split(";");
        }

        public void find(){

        }

        public boolean isWidth(String word){

            int index = word.indexOf('-');

            if(index < 0){
                return false;
            }

            return word.charAt(index+1) == '-';
        }

        public boolean isInput(String word){
            return word.indexOf('-') > -1;
        }
    }



}
