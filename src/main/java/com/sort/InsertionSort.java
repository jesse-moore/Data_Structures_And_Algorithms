package com.sort;

import java.util.Arrays;

public class InsertionSort {
    public static void sort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0 && arr[j]<arr[j-1]; j--) {
                if(arr[j]<arr[j-1]){
                    swap(arr, j-1, j);
                }
                System.out.println(j);
            }
            System.out.println(Arrays.toString(arr));
        }
    }

    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
