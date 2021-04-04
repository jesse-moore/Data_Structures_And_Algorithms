package com.sort;

public class MergeSort {
    public static void sort(int[] arr){
        int[] sorted = mergeSort(arr);
        System.arraycopy(sorted, 0, arr, 0, arr.length);
    }

    private static int[] mergeSort(int[] arr){
        if(arr.length <= 1) return arr;
        int mid = Math.floorDiv(arr.length,2);
        int[] left = new int[mid];
        int[] right = arr.length % 2==0?new int[mid]:new int[mid+1];
        for (int i = 0; i < arr.length; i++) {
            if(i<mid){
                left[i] = arr[i];
            } else {
                right[i-mid] = arr[i];
            }
        }
        left = mergeSort(left);
        right = mergeSort(right);
        return merge(left, right);
    }

    private static int[] merge(int[] arr1, int[] arr2){
        int[] sortedArr = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        while (i + j < arr1.length + arr2.length) {
            if(i >= arr1.length){
                sortedArr[i+j] = arr2[j];
                j++;
            } else if(j >= arr2.length){
                sortedArr[i+j] = arr1[i];
                i++;
            }else {
                if(arr1[i]<arr2[j]){
                    sortedArr[i+j] = arr1[i];
                    i++;
                } else {
                    sortedArr[i+j] = arr2[j];
                    j++;
                }
            }
        }
        return sortedArr;
    }
}