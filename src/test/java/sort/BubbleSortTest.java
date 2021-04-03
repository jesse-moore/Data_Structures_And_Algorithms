package sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BubbleSortTest {
    BubbleSort bubbleSort = new BubbleSort();
    @Test
    public void test1() {
        int[] testArr = {1,2,3,4,5,6,7,8};
        bubbleSort.sort(testArr);
        Assertions.assertTrue(isSorted(testArr));
    }

    @Test
    public void test2() {
        int[] testArr = {9,1,2,3,4,5,6,7,8};
        bubbleSort.sort(testArr);
        Assertions.assertTrue(isSorted(testArr));
    }

    @Test
    public void test3() {
        int[] testArr = {5,7,8,9,24,5,7,9,48,35,72,9,34,56,96,5,3,2,0};
        bubbleSort.sort(testArr);
        Assertions.assertTrue(isSorted(testArr));
    }

    private boolean isSorted(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i+1]) return false;
        }
        return true;
    }
}
