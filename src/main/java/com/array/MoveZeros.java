package com.array;

import java.util.Arrays;

public class MoveZeros {
    public static void moveZeroes(int[] nums) {
        if(nums.length<=1) return;
        int zeroes = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==0) zeroes++;
            else {
                nums[i-zeroes] = nums[i];
            }
        }
        for (int i = nums.length - zeroes; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
