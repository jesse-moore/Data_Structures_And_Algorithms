package com.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveDuplicatesFromSortedArrayTest {
    RemoveDuplicatesFromSortedArray solution = new RemoveDuplicatesFromSortedArray();

    @Test
    public void test1(){
        int[] sortedArr1 = {1,1,2};
        int result = solution.removeDuplicates(sortedArr1);
        assertEquals(result, 2);
    }

    @Test
    public void test2(){
        int[] sortedArr1 = {0,0,1,1,1,2,2,3,3,4};
        int result = solution.removeDuplicates(sortedArr1);
        assertEquals(result, 5);
    }
}
