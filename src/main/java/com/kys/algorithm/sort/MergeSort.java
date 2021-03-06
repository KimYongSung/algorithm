package com.kys.algorithm.sort;

public class MergeSort {

    public static void sort(int[] nums){
        mergeSort(nums, new int[nums.length], 0, nums.length - 1);
    }

    private static void mergeSort(int[] nums, int[] temp, int start, int end){
        if(start < end) {
            int mid = (start+end) / 2;
            mergeSort(nums, temp, start, mid);
            mergeSort(nums, temp, mid + 1, end);
            merge(nums, temp, start, mid, end);
        }
    }

    private static void merge(int[] arr, int[] temp, int start, int mid, int end){

        for(int i = start; i <= end; i++){
            temp[i] = arr[i];
        }

        int part1 = start;
        int part2 = mid + 1;
        int index = start;

        while(part1 <= mid && part2 <= end){
            if(temp[part1] <= temp[part2]) {
                arr[index] = temp[part1];
                part1++;
            }else{
                arr[index] = temp[part2];
                part2++;
            }
            index++;
        }

        for (int i = 0; i <= mid - part1; i++) {
            arr[index+i] = temp[part1+i];
        }
    }
}
