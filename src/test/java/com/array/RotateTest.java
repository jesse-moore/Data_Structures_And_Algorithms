package com.array;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;

public class RotateTest {

    private static int[][] input1 = new int[3][3];
    private static int[][] input2 = new int[4][4];
    private static int[][] answer1 = new int[3][3];
    private static int[][] answer2 = new int[4][4];

    @BeforeAll
    static void before(){
        initAnswers();
        initInputs();
    }

    private static void initAnswers(){
        answer1[0] = new int[]{7,4,1};
        answer1[1] = new int[]{8,5,2};
        answer1[2] = new int[]{9,6,3};
        answer2[0] = new int[]{15,13,2,5};
        answer2[1] = new int[]{14,3,4,1};
        answer2[2] = new int[]{12,6,8,9};
        answer2[3] = new int[]{16,7,10,11};
    }

    private static void initInputs(){
        input1[0] = new int[]{1,2,3};
        input1[1] = new int[]{4,5,6};
        input1[2] = new int[]{7,8,9};
        input2[0] = new int[]{5,1,9,11};
        input2[1] = new int[]{2,4,8,10};
        input2[2] = new int[]{13,3,6,7};
        input2[3] = new int[]{15,14,12,16};
    }

    @Test
    public void test1() {
        Rotate.rotate(input1);
        boolean result = checkAnswer(input1, answer1);
        Assertions.assertTrue(result, matrixToString(input1));
    }

    @Test
    public void test2() {
        Rotate.rotate(input2);
        Assertions.assertTrue(checkAnswer(input2, answer2), matrixToString(input2));
    }

    private static boolean checkAnswer(int[][] input, int[][] answer){
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                if(input[i][j] != answer[i][j]) return false;

            }
        }
        return true;
    }

    private static String matrixToString(int[][] matrix){
        StringBuilder result = new StringBuilder("\r");
        for (int[] ints : matrix) {
            result.append(Arrays.toString(ints)).append("\n");
        }
        return result.toString();
    }

}