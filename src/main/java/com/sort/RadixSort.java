package com.sort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RadixSort {

    public static void sort(int[] arr){
        int maxLength = maxLength(arr);
        Map<Integer, ArrayList<Integer>> buckets = new HashMap<>(10);
        for (int i = 0; i < 10; i++) {
            buckets.put(i, new ArrayList<>());
        }
        for (int i = 0; i < maxLength; i++) {
            for (int num : arr) {
                int indexValue = intAtIndex(num, i);
                ArrayList<Integer> bucket = buckets.get(indexValue);
                bucket.add(num);
            }
            int j = 0;
            for (int k = 0; k<10; k++) {
                ArrayList<Integer> nums = buckets.get(k);
                if(nums.size()==0) continue;
                for (int num:nums) {
                    arr[j] = num;
                    j++;
                }
                nums.clear();
            }
        }
    }

    private static int intAtIndex(int num, int index){
        return  (int) Math.floor(Math.abs(num)/Math.pow(10,index))%10;
    }

    private static int intLength(int num){
        if(num==0) return 1;
        return (int) Math.ceil(Math.log10(Math.abs(num)));
    }
    
    private static int maxLength(int[] nums){
        int max = 0;
        for (int num:nums) {
            max = Math.max(max,intLength(num));
        }
        return max;
    }
}
