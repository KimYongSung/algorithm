package com.kys.algorithm.sort;

public class InsertionSort {
    
    public void sort(int[] nums){
        for (int i = 1; i < nums.length; i++) {
            int temp = nums[i];
            int recv = i - 1;

            while((recv >= 0) && (nums[recv] > temp)){
                nums[recv+1] = nums[recv];
                recv--;
            }

            nums[recv+1] = temp;
        }
    }
}
