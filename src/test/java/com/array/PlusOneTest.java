package com.array;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;

import static com.array.PlusOne.plusOne;

public class PlusOneTest {

    @Test
    public void test1() {
        int[] input = {1,2,3};
        int[] result = plusOne(input);
        int[] answer = {1,2,4};
        Assertions.assertTrue(Arrays.equals(result,answer));
    }

    @Test
    public void test2() {
        int[] input = {4,3,2,1};
        int[] result = plusOne(input);
        int[] answer = {4,3,2,2};
        Assertions.assertTrue(Arrays.equals(result,answer));
    }

    @Test
    public void test3() {
        int[] input = {1,9,9,9};
        int[] result = plusOne(input);
        int[] answer = {2,0,0,0};
        Assertions.assertTrue(Arrays.equals(result,answer));
    }

    @Test
    public void test4() {
        int[] input = {9,9,9};
        int[] result = plusOne(input);
        System.out.println(Arrays.toString(result));
        int[] answer = {1,0,0,0};
        Assertions.assertTrue(Arrays.equals(result,answer));
    }

}