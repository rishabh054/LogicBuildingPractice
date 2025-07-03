package com.java.string;

import java.util.HashMap;
import java.util.Map;

public class HighestFreqencyCharacter {
    public static void main(String[] args) {
        String str = "crishabhckumarc";
        char[] ch = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0;i<ch.length;i++){
            map.put(ch[i],map.getOrDefault(ch[i],0)+1);
        }
        System.out.println(map);
        int maxOcc= map.get(ch[0]);
        char ch1=ch[0];
        for(char i : map.keySet()){
            if(map.get(i)>maxOcc){
                maxOcc = map.get(i);
                ch1=i;
            }
        }
        System.out.println(ch1 +" max occ "+ maxOcc );

    }
}
