package com.string;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import string.PermutationInString;

public class PermutationInStringTest {

    PermutationInString permute = new PermutationInString();

    @Test
    public void test1() {
        String s1 = "ab";
        String s2 = "eidbaooo";
        Assertions.assertTrue(permute.checkInclusion(s1,s2));

    }

    @Test
    public void test2() {
        String s1 = "ab";
        String s2 = "eidboaoo";
        Assertions.assertFalse(permute.checkInclusion(s1,s2));
    }

}
