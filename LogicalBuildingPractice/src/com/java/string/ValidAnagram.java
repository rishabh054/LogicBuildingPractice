package com.java.string;

import java.util.Arrays;

/** Given two strings s and t, return true if t is an anagram of s, and false otherwise.
Example 1:
Input: s = "anagram", t = "nagaram"

Output: true*/
public class ValidAnagram {
    public static void main(String[] args) {
        String s = "a", t = "b";
        System.out.println(isValid(s,t));

    }
    public static boolean isValid(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        for(int i=0;i <= ch1.length;i++){
            if(ch1[i] != ch2[i])
                return false;
        }
        return true;
    }
}
