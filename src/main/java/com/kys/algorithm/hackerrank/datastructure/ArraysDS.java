package com.kys.algorithm.hackerrank.datastructure;

import java.util.Arrays;

public class ArraysDS {

    // Complete the reverseArray function below.
    static int[] reverseArray(int[] a) {

        int[] result = new int[a.length];

        for (int i = a.length-1, j = 0; i >= 0; i--, j++) {
            result[j] = a[i];
        }

        return result;
    }
}
