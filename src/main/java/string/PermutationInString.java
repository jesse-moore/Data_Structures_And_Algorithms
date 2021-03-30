package string;

/**
 * Given two strings s1 and s2, write a function to return true if s2 contains the permutation of s1.
 * In other words, one of the first string's permutations is the substring of the second string.
 * */

public class PermutationInString {
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
        for (int i = 0; i < charArr.length; i++) {
            if(charArr[i] != 0) return false;
        }
        return true;
    }
}
