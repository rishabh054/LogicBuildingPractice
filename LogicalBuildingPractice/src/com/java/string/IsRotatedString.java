package com.java.string;

/**
 * Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.
 * A shift on s consists of moving the leftmost character of s to the rightmost position.
 * For example, if s = "abcde", then it will be "bcdea" after one shift.
 */
public class IsRotatedString {
    public static void main(String[] args) {
        String s = "abcde", goal = "cdeab";
        System.out.println(rotateString(s,goal));
    }
    public static boolean rotateString(String s, String goal) {

        if(s.length() != goal.length()){
            return false;
        }

        String finalString = s+s;
        if(finalString.contains(goal)){
            return  true;
        }
        return false;
    }
}
