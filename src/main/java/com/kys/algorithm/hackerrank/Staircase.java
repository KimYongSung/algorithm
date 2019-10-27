package com.kys.algorithm.hackerrank;

import java.util.Arrays;

public class Staircase {

    public static void staircase(int n) {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 1; i <= n; i++) {

            appendBlank(n-i, stringBuilder);
            appendStaircase(i, stringBuilder);
            stringBuilder.append("\n");
        }

        System.out.println(stringBuilder.toString());
    }

    static void appendStaircase(int length, StringBuilder stringBuilder){
        for (int i = 0; i < length; i++)
            stringBuilder.append("#");
    }

    static void appendBlank(int length, StringBuilder stringBuilder){
        for (int i = 0; i < length; i++)
            stringBuilder.append(" ");
    }

    // Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] ar) {

        Arrays.sort(ar);

        int length = ar.length;
        int count = 0;

        for (int i = length-1; i >= 0; i--) {

            if(i-1 < 0) {
                count++;
                break;
            }else if(ar[i] != ar[i-1]) {
                count++;
                break;
            }
            else count++;
        }

        return count;
    }
}
