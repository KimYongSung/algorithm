package com.kys.algorithm.codility;

import java.util.Arrays;

/**
 * 이것은 데모 작업이다.
 *
 * 함수 쓰기:
 *
 * class Solution { public in Solution(int[A] A); }
 *
 * N 정수의 배열 A가 주어지면 A에서 발생하지 않는 최소 양의 정수(0보다 큼)를 반환한다.
 *
 * 예를 들어, A = [1, 3, 6, 4, 1, 2]에서 함수는 5를 반환해야 한다.
 *
 * A = [1, 2, 3]인 경우 함수는 4를 반환해야 한다.
 *
 * A = [-1, -3]인 경우 함수는 1을 반환해야 한다.
 *
 * 다음과 같은 가정을 위한 효율적인 알고리즘을 작성한다.
 *
 * N은 [1] 범위 내의 정수다.100,000];
 * 어레이 A의 각 요소는 범위 내의 정수[-1,000,000..1,000,000,000]이다.
 * Codility Limited의 2009–2019 저작권. 무단 전재 금지 무단 복사, 출판 또는 공개 금지.
 *
 */
public class MinInteger {

    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);

        int value = 1;

        for (int i: A) {
            if(i > 0 & i == value){
                value++;
            }
        }

        return value;
    }

}
