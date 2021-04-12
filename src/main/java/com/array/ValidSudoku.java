package com.array;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {

    public static boolean isValidSudoku(char[][] board){
        for (char[] row:board) {
            if(!checkRow(row)) return false;
        }
        if(!checkColumns(board)) return false;
        return checkSquares(board);
    }

    private static boolean checkRow(char[] row){
        HashSet<Character> charRow = new HashSet<>();
        for (char chr: row) {
            if(chr == '.') continue;
            if(charRow.contains(chr)) return false;
            charRow.add(chr);
        }
        return true;
    }

    private static boolean checkColumns(char[][] input){
        Set<Character> charColumn = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            charColumn.clear();
            for (char[] charArr: input) {
                char current = charArr[i];
                if(current == '.') continue;
                if(charColumn.contains(current)) return false;
                charColumn.add(current);
            }
        }
        return true;
    }

    private static boolean checkSquares(char[][] input){
        int rowStart;
        Set<Character> charSquare = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            charSquare.clear();
            rowStart = (int) Math.floor((i/3)%3)*3;
            for (int j = 0; j < 9; j++) {
                int row = (int) (rowStart + Math.floor((j/3)%3));
                int index = j%3+(i%3*3);
                char current = input[row][index];
                if(current == '.') continue;
                if(charSquare.contains(current)) return false;
                charSquare.add(current);
            }
        }
        return true;
    }
}
