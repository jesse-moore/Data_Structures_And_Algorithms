package com.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.util.List;

import static org.junit.Assert.assertEquals;


public class PermutationsTest {
    Permutations solution = new Permutations();

    @Test
    public void test1() {
        int[] nums = {1,2,3};
        List<List<Integer>> result = solution.permute(nums);
        String answer = "[[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 2, 1]]";
        Assertions.assertEquals(result.toString(), answer);
    }

    @Test
    public void test2() {
        int[] nums = {0,1};
        List<List<Integer>> result = solution.permute(nums);
        String answer = "[[0, 1], [1, 0]]";
        Assertions.assertEquals(result.toString(), answer);
    }

}