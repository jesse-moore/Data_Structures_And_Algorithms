package com.array;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length-1; i >= 0; i--) {
            if(digits[i]==9){
                digits[i]=0;
            } else {
                digits[i]++;
                return digits;
            }
        }
        int[] overArray = new int[digits.length+1];
        overArray[0] = 1;
        return overArray;
    }
}
