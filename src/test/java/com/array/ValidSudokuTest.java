package com.array;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.Arrays;

public class ValidSudokuTest {

    @Test
    public void test1() {
        char[][] input = input1();
        Assertions.assertTrue(ValidSudoku.isValidSudoku(input));
    }

    @Test
    public void test2() {
        char[][] input = input2();
        Assertions.assertFalse(ValidSudoku.isValidSudoku(input));
    }

    @Test
    public void test3() {
        char[][] input = input3();
        Assertions.assertFalse(ValidSudoku.isValidSudoku(input));
    }

    private static char[][] input1(){
        char[] row1 = {'5','3','.','.','7','.','.','.','.'};
        char[] row2 = {'6','.','.','1','9','5','.','.','.'};
        char[] row3 = {'.','9','8','.','.','.','.','6','.'};
        char[] row4 = {'8','.','.','.','6','.','.','.','3'};
        char[] row5 = {'4','.','.','8','.','3','.','.','1'};
        char[] row6 = {'7','.','.','.','2','.','.','.','6'};
        char[] row7 = {'.','6','.','.','.','.','2','8','.'};
        char[] row8 = {'.','.','.','4','1','9','.','.','5'};
        char[] row9 = {'.','.','.','.','8','.','.','7','9'};
        return new char[][]{row1, row2, row3, row4, row5, row6, row7, row8, row9};
    }

    private static char[][] input2(){
        char[] row1 = {'5','3','.','.','7','.','.','.','.'};
        char[] row2 = {'6','.','.','1','9','5','.','.','.'};
        char[] row3 = {'.','9','8','.','.','.','.','6','.'};
        char[] row4 = {'8','.','.','.','6','.','.','.','3'};
        char[] row5 = {'4','.','.','8','.','3','.','.','1'};
        char[] row6 = {'7','.','.','.','2','.','.','.','6'};
        char[] row7 = {'.','6','.','.','.','.','2','8','.'};
        char[] row8 = {'6','.','.','4','1','9','.','.','5'};
        char[] row9 = {'.','.','.','.','8','.','.','7','9'};
        return new char[][]{row1, row2, row3, row4, row5, row6, row7, row8, row9};
    }
    private static char[][] input3(){
        char[] row1 = {'8','3','.','.','7','.','.','.','.'};
        char[] row2 = {'6','.','.','1','9','5','.','.','.'};
        char[] row3 = {'.','9','8','.','.','.','.','6','.'};
        char[] row4 = {'1','.','.','.','6','.','.','.','3'};
        char[] row5 = {'4','.','.','8','.','3','.','.','1'};
        char[] row6 = {'7','.','.','.','2','.','.','.','6'};
        char[] row7 = {'.','6','.','.','.','.','2','8','.'};
        char[] row8 = {'.','.','.','4','1','9','.','.','5'};
        char[] row9 = {'.','.','.','.','8','.','.','7','9'};
        return new char[][]{row1, row2, row3, row4, row5, row6, row7, row8, row9};
    }

}