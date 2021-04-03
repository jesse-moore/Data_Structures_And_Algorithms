package com.sort;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static com.utils.CheckSort.isSorted;

public class SelectionSortTest {

    SelectionSort selectionSort = new SelectionSort();
    @Test
    public void test1() {
        int[] testArr = {1,2,3,4,5,6,7,8};
        selectionSort.sort(testArr);
        Assertions.assertTrue(isSorted(testArr));
    }

    @Test
    public void test2() {
        int[] testArr = {9,1,2,3,4,5,6,7,8};
        selectionSort.sort(testArr);
        Assertions.assertTrue(isSorted(testArr));
    }

    @Test
    public void test3() {
        int[] testArr = {5,7,8,9,24,5,7,9,48,35,72,9,34,56,96,5,3,2,0};
        selectionSort.sort(testArr);
        Assertions.assertTrue(isSorted(testArr));
    }

}