package com.kys.algorithm.codility;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CyclicRotation {
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        LinkedList<Integer> nums = new LinkedList<>();

        Arrays.stream(A)
              .boxed()
              .forEach(num -> nums.add(num));

        for (int moveCnt = 0; moveCnt < K; moveCnt++) {
            Integer num = nums.removeLast();
            nums.addFirst(num);
        }

        return listToArray(nums);
    }

    private int[] listToArray(List<Integer> nums){

        int size = nums.size();

        int[] array = new int[size];

        for (int index = 0; index < size; index++) {
            array[index] = nums.get(index);
        }

        return array;
    }
}
