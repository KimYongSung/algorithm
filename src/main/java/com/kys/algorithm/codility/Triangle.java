package com.kys.algorithm.codility;

import java.util.Arrays;

public class Triangle {

    public int solution(int[] A){

        if(A.length < 3) return 0;

        Arrays.sort(A);

        int loopCount = A.length - 2;

        for (int i = 0; i < loopCount; i++) {
            long temp = (long) A[i] + (long) A[i+1];
            if(temp > A[i+2]) return 1;
        }

        return 0;
    }
}
