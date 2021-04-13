package com.array;

public class Rotate {
    public static void rotate(int[][] matrix) {
        transpose(matrix);
        reverse(matrix);
    }

    private static void transpose(int[][] input){
        int n = input.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = input[i][j];
                input[i][j] = input[j][i];
                input[j][i] = temp;
            }
        }
    }

    private static void reverse(int[][] input){
        int n = input.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n/2; j++) {
                int temp = input[i][j];
                input[i][j] = input[i][n-1-j];
                input[i][n-1-j] = temp;
            }
        }
    }
}
