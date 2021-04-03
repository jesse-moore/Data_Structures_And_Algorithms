package com.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PermutationInStringKMPTest {
    PermutationInString permute = new PermutationInString();

    @Test
    public void test1() {
        String s1 = "ab";
        String s2 = "eidabooo";
        Assertions.assertTrue(permute.kmpAlgo(s2,s1));

    }

    @Test
    public void test2() {
        String s1 = "ab";
        String s2 = "eidboaoo";
        Assertions.assertFalse(permute.kmpAlgo(s2,s1));
    }

    @Test
    public void test3() {
        String s1 = "ab";
        String s2 = "aaaaanaaiidhjkhdhsdghfklgbabbbabakljsdgklgjfsdlf";
        Assertions.assertTrue(permute.kmpAlgo(s2,s1));
    }

}
