package com.array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {

    public static boolean containsDuplicates(int[] nums) {
        Set<Integer> intSet = new HashSet<>();
        for (int num : nums) {
            if (intSet.contains(num)) {
                return true;
            } else {
                intSet.add(num);
            }
        }
        return false;
    }
}
