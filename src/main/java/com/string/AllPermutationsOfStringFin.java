package com.string;

import java.util.ArrayList;
import java.util.List;

public class AllPermutationsOfStringFin {

    public static void allPermutationsOfString(String str){
        List<String> arr = new ArrayList<>();
        permutate(str, arr, 0,str.length()-1);
        for(String item:arr){
            System.out.println(item);
        }
    }

    public static void permutate(String str, List<String> arr, int i, int j){

        if(i == j) {
            arr.add(str);
            return;
        }

        for (int index = i; index <= j; index++) {
            String s = swap(str, i, index);
            permutate(s,arr,i+1, j);
        }
    }

    public static String swap(String str, int i, int j){
        char temp;
        char[] charArray = str.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
