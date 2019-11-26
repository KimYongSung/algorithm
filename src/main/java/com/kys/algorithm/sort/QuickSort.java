package com.kys.algorithm.sort;

public class QuickSort {

    public static void sort(int[] nums){
        quickSort(nums, 0, nums.length-1);
    }

    private static void quickSort(int[] nums, int left, int right){

        int pi = partition(nums, left, right);

        if(left < pi -1){
            quickSort(nums, left, pi-1);
        }

        if(right > pi){
            quickSort(nums, pi, right);
        }
    }

    private static int partition(int[] nums, int left, int right){

        int mid = (left + right) / 2;
        int pivot = nums[mid];

        while ( left <= right ) {

            while (pivot > nums[left]) left++;
            while (pivot < nums[right]) right--;

            if(left <= right){
                swap(nums, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

    private static void swap(int[] nums, int index1, int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
