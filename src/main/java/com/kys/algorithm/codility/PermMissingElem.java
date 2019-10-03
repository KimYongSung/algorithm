package com.kys.algorithm.codility;

import java.util.Arrays;

public class PermMissingElem {

    public int solution(int[] A){

        Arrays.sort(A);

        return findMissingElem(A);
    }

    private Integer findMissingElem(int[] elems) {

        int value = 1;

        for (int index = 0 ; index < elems.length ; index++) {
            if(elems[index] == value){
                value++;
            }
        }

        return value;
    }
}
