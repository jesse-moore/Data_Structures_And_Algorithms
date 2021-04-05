package com.string;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import static com.string.AllPermutationsOfString.allPermutationsOfString;

public class AllPermutationsOfStringTest {

    @Test
    public void test1() {
        String str = "ABC";
        allPermutationsOfString(str);
    }

}