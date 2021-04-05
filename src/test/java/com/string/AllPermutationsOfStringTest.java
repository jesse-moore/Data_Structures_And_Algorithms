package com.string;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import static com.string.AllPermutationsOfString.allPermutationsOfString;
import static com.string.AllPermutationsOfStringFin.allPermutationsOfStringFin;


public class AllPermutationsOfStringTest {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void test1() {
        String str = "ABCD";
        allPermutationsOfString(str);
        String output = outputStreamCaptor.toString().trim();
        String[] outputArr = output.split("\\r\\n");

        List<String> answerArr = allPermutationsOfStringFin(str);
        Assertions.assertEquals(outputArr.length, answerArr.size());
        boolean containsAll = Arrays.asList(outputArr).containsAll(answerArr);
        Assertions.assertTrue(containsAll);
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

}