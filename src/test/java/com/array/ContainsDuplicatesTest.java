package com.array;

import static com.array.ContainsDuplicates.containsDuplicates;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static com.utils.CheckSort.isSorted;

public class ContainsDuplicatesTest {

    @Test
    public void test1() {
        int[] testArr = {1,2,3,4,5,6,7,8};
        Assertions.assertFalse(containsDuplicates(testArr));
    }

    @Test
    public void test2() {
        int[] testArr = {9,1,2,3,4,5,6,7,8};
        Assertions.assertFalse(containsDuplicates(testArr));
    }

    @Test
    public void test3() {
        int[] testArr = {88,60,14,24,5,7,9,48,35,72,9,34,56,96,5,3,2,0};
        Assertions.assertTrue(containsDuplicates(testArr));
    }

    @Test
    public void test4() {
        int[] testArr = {1,2,3,3,0};
        Assertions.assertTrue(containsDuplicates(testArr));
    }

}