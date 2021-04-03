package sort;

import java.util.Arrays;

public class BubbleSort {

    public void sort(int[] arr){
        boolean hasSwapped;
        for (int i = arr.length - 1; i > 0; i--) {
            hasSwapped = false;
            for (int j = 0; j < i; j++) {
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                    hasSwapped = true;
                }
            }
            if(!hasSwapped) return;
        }
    }

    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
