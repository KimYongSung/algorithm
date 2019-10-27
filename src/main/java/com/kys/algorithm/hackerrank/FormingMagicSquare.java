package com.kys.algorithm.hackerrank;

public class FormingMagicSquare {

    // Complete the formingMagicSquare function below.
    static int formingMagicSquare(int[][] s) {
        MagicSquare magicSquare = new MagicSquare(s);
        return magicSquare.findFormingMagicSquare();
    }

    static class MagicSquare{

        private final int[][] square;

        private final int[][][] possiblePermutations = {
                {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}},// 1

                {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}},// 2

                {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}},// 3

                {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}},// 4

                {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}},// 5

                {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}},// 6

                {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}},// 7

                {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}},// 8
        };

        public MagicSquare(int[][] square) {
            this.square = square;
        }

        public int findFormingMagicSquare(){

            int min = Integer.MAX_VALUE;

            for (int i = 0; i < possiblePermutations.length; i++) {

                int cost = 0;

                for (int j = 0; j < 3; j++) {
                    for (int k = 0; k < 3; k++) {
                        cost += Math.abs(square[j][k] - possiblePermutations[i][j][k]);
                    }
                }

                min = Math.min(min, cost);
            }

            return min;
        }

    }


}
