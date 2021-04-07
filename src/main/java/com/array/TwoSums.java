package com.array;

import java.util.Arrays;

public class TwoSums {
    public static int[] twoSum(int[] nums, int target) {
        int[] numsCopy = Arrays.copyOf(nums, nums.length);
        Arrays.sort(numsCopy);
        int i = 0;
        int j = numsCopy.length-1;
        while (numsCopy[i]+numsCopy[j]!=target){
            if(numsCopy[i]+numsCopy[j]<target) i++;
            if(numsCopy[i]+numsCopy[j]>target) j--;
        }
        int left = indexOf(nums, numsCopy[i]);
        int right = indexOf(nums, numsCopy[j], true);
        return new int[]{left, right};
    }

    private static int indexOf(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target) return i;
        }
        return -1;
    }

    private static int indexOf(int[] arr, int target, boolean reverse){
        if(!reverse) return indexOf(arr, target);
        for (int i = arr.length-1; i >= 0; i--) {
            if(arr[i] == target) return i;
        }
        return -1;
    }
}
