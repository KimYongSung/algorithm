package com.kys.algorithm.search;

public class BinarySearch {

    public static int search(int[] nums, int num){
        return search(nums, 0, nums.length -1, num);
    }

    private static int search(int[] nums, int start, int end, int num){

        if(start > end) return -1;

        int mid = (start + end) / 2;

        if(num == mid){
            return mid;
        }else if(mid > num){
            return search(nums, start, mid - 1, num);
        }else {
            return search(nums, mid + 1, end ,num);
        }
    }

    public static int whileSearch(int[] nums, int num){

        int start = 0;
        int end = nums.length - 1;
        int mid = 0;

        while (start <= end){

            mid = (start + end) / 2;

            if(nums[mid] == num){
                return mid;
            }else if(nums[mid] > num){
                end = mid -1;
            }else{
                start = mid + 1;
            }
        }

        return -1;
    }
}
