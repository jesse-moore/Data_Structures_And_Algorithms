package com.sort;

public class SelectionSort {
    public void sort(int[] arr){
        if(arr.length == 0) return;
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i; j < arr.length; j++) {
                if(arr[j]<arr[min]) min = j;
            }
            if(min != i){
                swap(arr, i, min);
            }
        }
    }

    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
