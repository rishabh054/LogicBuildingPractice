package com.java.string;

import java.util.HashMap;
import java.util.Map;

public class CommonCharBetweenStrings {
    public static void main(String[] args) {
        String str1="rishabhkumar";
        String  str2 ="twqlgrgfakh";

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0;i<ch1.length;i++){
            map.put(ch1[i],map.getOrDefault(ch1[i],0)+1);
        }
        for(int i=0;i<ch2.length;i++){
            if(map.containsKey(ch2[i])){
                System.out.println(ch2[i]);
            }
        }
    }
}
