package com.kys.algorithm.codility;

public class PassingCars {

    private final int MAX_PAIR = 1000000000;

    public int solution(int[] A){

        if(A == null){
            return 0;
        }

        int carPairs = 0;
        int eastCars = 0;

        for (int i = 0; i < A.length; i++) {

            if (carPairs > MAX_PAIR) return -1;

            if(A[i] == 0) eastCars++;
            else if(A[i] == 1 && eastCars > 0) carPairs+=eastCars;
        }

        return carPairs;
    }
}
