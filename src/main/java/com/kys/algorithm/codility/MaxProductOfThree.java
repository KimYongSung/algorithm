package com.kys.algorithm.codility;

import java.util.Arrays;

public class MaxProductOfThree {

    public int solution(int[] A){

        Arrays.sort(A);

        int rightValue = A[A.length-1] * A[A.length-2] * A[A.length-3];

        int leftValue = A[0] * A[1] * A[A.length-1];

        return Math.max(rightValue, leftValue);
    }
}
