package com.kys.algorithm.sort;

public class MergeSort2 {

    public static void sort(int[] arr) {
        mergeSort(arr, new int[arr.length], 0, arr.length-1);
    }

    private static void mergeSort(int[] arr, int[] temp, int start, int end){

        if(start < end){
            int mid = (start + end) /2;
            mergeSort(arr, temp, 0, mid);
            mergeSort(arr, temp, mid + 1, end);
            merge(arr, temp, start, mid, end);
        }
    }

    private static void merge(int[] arr, int[] temp, int start, int mid, int end){

        for (int i = start; i <= end; i++) {
            temp[i] = arr[i];
        }

        int left = start;
        int right = mid + 1;
        int index = start;

        while (left <= mid && right <= end){
            if(temp[left] < temp[right]){
                arr[index] = temp[left];
                left++;
            }else{
                arr[index] = temp[right];
                right++;
            }
            index++;
        }

        for (int i = 0; i <= mid - left; i++) {
            arr[index+i] = temp[left+i];
        }
    }
}
