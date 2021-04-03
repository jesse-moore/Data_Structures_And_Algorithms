package com.string;

/**
 * Given two strings s1 and s2, write a function to return true if s2 contains the permutation of s1.
 * In other words, one of the first string's permutations is the substring of the second string.
 * */

public class PermutationInString {

    private int[] lpsGen(String str){
        int n = str.length();
        int i = 0;
        int j = 1;
        int[] lps = new int[n];

        while(j<n){
            if(str.charAt(j) == str.charAt(i)){
                lps[j] = lps[j-1] + 1;
                j++;
                i++;
            } else {
                if(i == 0){
                    j++;
                } else {
                    i = lps[i] - 1;
                }
            }
        }
        return lps;
    }

    public boolean kmpAlgo(String lngStr, String incStr){
        int lgnLength = lngStr.length();
        int incLength = incStr.length();
        int i = 0;
        int j = 0;
        int[] lps = lpsGen(incStr);
        while(i<lgnLength-1){
            if(j == incLength) return true;
            if(lngStr.charAt(i) == incStr.charAt(j)) {
                i++;
                j++;
            } else {
                if(j==0){
                    i++;
                } else {
                    j = lps[j-1];
                }
            }
        }
        return false;
    }

    public boolean checkInclusion(String s1, String s2) {

        if(s1.length()>s2.length()) return false;
        int[] charCount = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            charCount[s1.charAt(i) - 'a'] ++;
        }

        for (int i = 0; i < s2.length(); i++) {
            charCount[s2.charAt(i) - 'a']--;
            if(i >= s1.length()){
                charCount[s2.charAt(i-s1.length()) - 'a']++;
            }
            if(isZeroed(charCount)) return true;
        }
        return false;
    }

    public boolean isZeroed(int [] charArr){
        for (int j : charArr) {
            if (j != 0) return false;
        }
        return true;
    }

    public boolean checkInclusionBruteForce(String s1, String s2) {
        boolean check = false;
        for (int i = 0; i < s2.length(); i++) {
            String subS2 = s2.substring(i);
            check = checkAtIndex(s1,subS2);
            if(check) break;
        }
        return check;
    }

    public boolean checkAtIndex(String s1, String s2){
        String temp = s1;
        boolean check = false;
        for (int i = 0; i < s2.length(); i++) {
            char s2Char = s2.charAt(i);
            int index = temp.indexOf(s2Char);
            if(index >= 0){
                temp = temp.substring(0,index) + temp.substring(index+1);
                if(temp.length() == 0) {
                    check = true;
                    break;
                }
            } else {
                break;
            }
        }
        return check;
    }
}
