package com.kys.algorithm.sort;

public class BubbleSort {

    public void sort(int[] nums){
        for(int i = 0; i < nums.length; i++){
            for (int j = 1; j < nums.length; j++) {
                if(nums[j-1] > nums[j]){
                    swap(nums, j-1 ,j );
                }
            }
        }
    }

    private void swap(int[] nums, int index1, int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
