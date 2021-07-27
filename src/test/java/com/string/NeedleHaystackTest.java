package com.string;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class NeedleHaystackTest {

    @Test
    public void test1() {
        String h = "hello";
        String n = "ll";
        Assertions.assertEquals(2,NeedleHaystack.strStr(h,n));
    }

    @Test
    public void test2() {
        String h = "aaaaa";
        String n = "bba";
        Assertions.assertEquals(-1,NeedleHaystack.strStr(h,n));
    }

    @Test
    public void test3() {
        String h = "";
        String n = "";
        Assertions.assertEquals(0,NeedleHaystack.strStr(h,n));
    }

    @Test
    public void test4() {
        String h = "hello";
        String n = "helloworld";
        Assertions.assertEquals(-1,NeedleHaystack.strStr(h,n));
    }

}