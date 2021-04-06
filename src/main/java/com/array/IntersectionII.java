package com.array;

import java.util.ArrayList;

public class IntersectionII{
    public static int[] intersectII(int[] nums1, int[] nums2){
        ArrayList<Integer> numsList = new ArrayList<>();
        ArrayList<Integer> resultList = new ArrayList<>();
        for (int num:nums1) {
            numsList.add(num);
        }
        for (int i = 0; i < nums2.length && numsList.size()>0; i++) {
            int index = numsList.indexOf(nums2[i]);
            if(index>=0) {
                resultList.add(nums2[i]);
                numsList.remove(index);
            }
        }

        int[] result = new int[resultList.size()];
        for(int i = 0; i < resultList.size(); i++) result[i] = resultList.get(i);
        return result;
    }
}
