package com.string;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class ReverseStringTest {

    private static final char[] input1 = {'h','e','l','l','o'};
    private static final char[] input2 = {'H','a','n','n','a','h'};
    private static final char[] answer1 = {'o','l','l','e','h'};
    private static final char[] answer2 = {'h','a','n','n','a','H'};


    @Test
    public void test1() {
        ReverseString.reverseString(input1);
        Assertions.assertArrayEquals(input1, answer1);
    }

    @Test
    public void test2() {
        ReverseString.reverseString(input2);
        Assertions.assertArrayEquals(input2, answer2);
    }

}