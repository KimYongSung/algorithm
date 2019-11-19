package com.kys.algorithm.sort;

public class SelectionSort {

    public void sort(int[] nums){
        for (int i = 0; i < nums.length - 1; i++) {
            int minIndex = i;
            for (int j = i+1; j < nums.length; j++) {
                if(nums[minIndex] > nums[j])
                    minIndex = j;
            }

            swap(nums, i, minIndex);
        }
    }

    private void swap(int[] nums, int index1, int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
