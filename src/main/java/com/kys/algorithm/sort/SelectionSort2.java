package com.kys.algorithm.sort;

public class SelectionSort2 {

    public static void sort(int[] arr){

        for (int i = 0; i < arr.length-1; i++) {
            int minIndex = i;

            for (int j = i+1; j < arr.length; j++) {
                if(arr[minIndex] > arr[j])
                    minIndex = j;
            }

            SortSupport.swap(arr, i, minIndex);
        }
    }
}
