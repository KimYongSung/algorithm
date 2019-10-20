package com.kys.algorithm.codility;

import java.util.Objects;

/**
 * 부분집합은 2의 부분집합, 3의 부분집합에 다 포함되므로 두가지 경우에 대해 비교
 *
 * 출처: https://poltman.tistory.com/82 [내가 보는 세상 이야기]
 */
public class MinAvgTwoSlice {
    public int solution(int[] A){

        int ans = 0;
        double avg = (A[0] + A[1]) / 2;
        double tmp;

        for (int i = 2; i < A.length; i++) {
            tmp = (double)(A[i-2] + A[i-1] + A[i]) / 3;
            if(tmp < avg){
                avg = tmp;
                ans = i-2;
            }

            tmp = (double)(A[i-1] + A[i]) / 2;
            if(tmp < avg){
                avg = tmp;
                ans = i - 1;
            }
        }

        return ans;
    }
}
