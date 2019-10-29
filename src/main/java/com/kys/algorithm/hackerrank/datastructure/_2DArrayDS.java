package com.kys.algorithm.hackerrank.datastructure;

public class _2DArrayDS {
    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                max = Math.max(max, calc(arr, i, j));
            }
        }
        return max;
    }

    static int calc(int[][] arr, int x, int y){
        return arr[x][y] + arr[x][y+1] + arr[x][y+2] + arr[x+1][y+1] + arr[x+2][y] + arr[x+2][y+1] + arr[x+2][y+2];
    }
}
