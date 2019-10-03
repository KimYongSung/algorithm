package com.kys.algorithm.codility;

import java.util.Arrays;
import java.util.Objects;

public class PermCheck {

    public int solution(int[] A){

        if(Objects.isNull(A) || A.length == 0){
            return 0;
        }

        Arrays.sort(A);

        for (int i = 0, value=1; i < A.length; i++, value++) {
            if(A[i] != value){
                return 0;
            }
        }

        return 1;
    }
}
