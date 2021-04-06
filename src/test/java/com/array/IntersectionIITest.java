package com.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static com.array.IntersectionII.intersectII;

public class IntersectionIITest {

    @Test
    public void test1() {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] output = intersectII(nums1, nums2);
        Assertions.assertEquals(output.length,2);

        ArrayList<Integer> answerArr = new ArrayList<>(Arrays.asList(4, 9));
        for (int num: output) {
            int index = answerArr.indexOf(num);
            if(index>=0) answerArr.remove(index);
        }
        Assertions.assertEquals(answerArr.size(),0);
    }

    @Test
    public void test2() {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] output = intersectII(nums1, nums2);
        Assertions.assertEquals(output.length,2);

        ArrayList<Integer> answerArr = new ArrayList<>(Arrays.asList(2, 2));
        for (int num: output) {
            int index = answerArr.indexOf(num);
            if(index>=0) answerArr.remove(index);
        }
        Assertions.assertEquals(answerArr.size(),0);
    }

}