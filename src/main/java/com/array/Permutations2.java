package com.array;

import java.util.ArrayList;
import java.util.List;

public class Permutations2 {

    public List<List<Integer>> permute(int[] nums) {
        List<Integer> numsList = new ArrayList<>();
        for (int num:nums) {
            Integer i = num;
            numsList.add(i);
        }
        List<List<Integer>> result = new ArrayList<>();
        calc(result, numsList, 0, nums.length-1);
        return result;
    }

    public static void calc(List<List<Integer>> list, List<Integer> numsList, int i, int j){

        if(i==j) {
            list.add(numsList);
            return;
        }

        for (int k = i; k <= j; k++) {
            List<Integer> newNumList = new ArrayList<>(numsList);
            List<Integer> result = swap(newNumList, i, k);
            calc(list, result, i+1, j);
        }

    }

    public static List<Integer> swap(List<Integer> nums, int i, int j){
        int temp = nums.get(i);
        nums.set(i,nums.get(j));
        nums.set(j, temp);
        return nums;
    }
}
