package com.string;

public class NeedleHaystack {
    public static int strStr(String haystack, String needle){
        int hLength = haystack.length();
        int nLength = needle.length();
        if(nLength==0) return 0;
        if(hLength<nLength) return -1;
        for (int i = 0; i < hLength; i++) {
            for (int j = 0; ; j++) {
                if(j==nLength) return i;
                if(i+j == hLength) return -1;
                if(needle.charAt(j)!=haystack.charAt(i+j)) break;
            }
        }
        return -1;
    }
}
