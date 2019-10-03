package com.kys.algorithm.codility;

import java.util.Objects;

public class TapeEquilibrium {

    public int solution(int[] A){

        if(Objects.isNull(A) || A.length == 0){
            return 1;
        }

        int minValue = 0;
        int total = getTotal(A);

        for (int P = 0 , first = A[P], second = total - A[P]; P < A.length-1 ; P++, first += A[P], second -= A[P]) {

            int diff = Math.abs(first - second);

            minValue = P == 0 ? diff :  Math.min(diff, minValue);
        }

        return minValue;
    }

    private int getTotal(int[] A) {
        int second = 0;
        for(int i = 0; i<A.length;i++){
            second += A[i];
        }
        return second;
    }

}
