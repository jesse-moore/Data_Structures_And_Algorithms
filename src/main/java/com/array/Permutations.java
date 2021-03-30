package com.array;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.
 */

public class Permutations {
    public List<List<Integer>> permute(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> prefix = new ArrayList<>();
        List<Integer> remaining = new ArrayList<>();
        for (int num:nums) {
            remaining.add(num);
        }
        calc(result, prefix, remaining);
        return result;

    }

    public static void calc(List<List<Integer>> list, List<Integer> prefix, List<Integer> remaining){
        if(remaining.size() == 0){
            list.add(prefix);
            return;
        }

        for (int i = 0; i < remaining.size(); i++) {
            List<Integer> newPrefix = new ArrayList<>(prefix);
            newPrefix.add(remaining.get(i));

            List<Integer> newRemaining = new ArrayList<>();
            newRemaining.addAll(remaining.subList(0,i));
            newRemaining.addAll(remaining.subList(i+1, remaining.size()));
            calc(list, newPrefix, newRemaining);
        }

    }
}
