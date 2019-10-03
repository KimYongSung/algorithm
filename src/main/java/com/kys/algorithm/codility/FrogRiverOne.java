package com.kys.algorithm.codility;

import java.util.*;

public class FrogRiverOne {

    public int solution(int X, int[] A){

        boolean[] cache = new boolean[X+1];
        int hitCount = 0;

        for (int i = 0; i < A.length; i++) {

            int river = A[i];

            if(!cache[river]){
                hitCount++;
                cache[river] = true;
            }

            if(hitCount == X){
                return i;
            }
        }

        return -1;
    }
}
