package com.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.array.TwoSums.twoSum;

public class TwoSumsTest {

    @Test
    public void test1() {
        int[] nums = {3,2,4};
        int target = 6;
        int[] result = twoSum(nums, target);
        int[] answer = {1,2};
        Assertions.assertArrayEquals(result, answer,"Result: " + Arrays.toString(result) + "\nExpected: " + Arrays.toString(answer) + "\n" );
    }

    @Test
    public void test2() {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result = twoSum(nums, target);
        int[] answer = {0,1};
        Assertions.assertArrayEquals(result, answer,"Result: " + Arrays.toString(result) + "\nExpected: " + Arrays.toString(answer) + "\n" );
    }

    @Test
    public void test3() {
        int[] nums = {3,3};
        int target = 6;
        int[] result = twoSum(nums, target);
        int[] answer = {0,1};
        Assertions.assertArrayEquals(result, answer,"Result: " + Arrays.toString(result) + "\nExpected: " + Arrays.toString(answer) + "\n" );
    }



}