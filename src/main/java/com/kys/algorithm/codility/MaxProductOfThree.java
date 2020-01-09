package com.kys.algorithm.codility;

import java.util.Arrays;

public class MaxProductOfThree {

    public int solution(int[] A){

        Arrays.sort(A);

        int index =  A.length-1;

        return A[index] * A[index-1] * A[index-2];
    }
}
