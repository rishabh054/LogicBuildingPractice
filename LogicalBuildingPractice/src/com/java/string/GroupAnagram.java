package com.java.string;

import java.util.*;

public class GroupAnagram {
    public static void main(String[] args) {
        String[] list = {"eat","tea","tan","ate","nat","bat"} ;
        Map<String, List<String>> map = new HashMap<>();

        for(String s: list){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            map.computeIfAbsent(key,k-> new ArrayList<>()).add(s);
        }
        System.out.println(map.values());
    }
}
