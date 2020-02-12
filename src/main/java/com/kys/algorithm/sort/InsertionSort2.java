package com.kys.algorithm.sort;

public class InsertionSort2 {

    public static void sort(int[] arr){

        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int prev = i-1;
            while (prev >= 0 && arr[prev] > temp){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = temp;
        }
    }
}
