package com.kys.algorithm.codility;

import java.util.HashSet;
import java.util.Set;

public class Distinct {

    public int solution(int[] A) {
        // write your code in Java SE 8
        Set<Integer> distinct = new HashSet<>();
        for (int num: A) {
            distinct.add(num);
        }
        return distinct.size();
    }
}
