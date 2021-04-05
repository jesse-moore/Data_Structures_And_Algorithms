package com.string;

import java.util.ArrayList;
import java.util.List;

public class AllPermutationsOfString {

    public static void allPermutationsOfString(String str){

        permute(str, 0, str.length()-1);

    }

    private static void permute(String str, int i, int j){

        if(i==j){
            System.out.println(str);
            return;
        }

        for (int index = i; index <= j ; index++) {
            String s = swap(str, i, index);
            permute(s, i+1, j);
        }
    }

    private static String swap(String str, int i, int j){
        char[] charArr = str.toCharArray();
        char temp = charArr[i];
        charArr[i] = charArr[j];
        charArr[j] = temp;
        return String.valueOf(charArr);
    }
}
