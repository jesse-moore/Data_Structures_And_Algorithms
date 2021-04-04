package com.sort;

import java.util.Arrays;

public class QuickSort {
    public static void sort(int[] arr){
        quickSort(arr, 0, arr.length-1);
    }

    private static void quickSort(int[] arr, int left, int right){
        if(left<right){
            int pivotIndex = pivot(arr, left, right);
            quickSort(arr, left, pivotIndex-1);
            quickSort(arr, pivotIndex+1, right);
        }
    }

    private static int pivot(int[] arr, int start, int end){
        int pivot = arr[start];
        int swapIdx = start;
        for (int i = start + 1; i < arr.length; i++) {
            if(pivot>arr[i]){
                swapIdx++;
                swap(arr, swapIdx, i);
            }
        }
        swap(arr, start, swapIdx);
        return swapIdx;
    }

    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
