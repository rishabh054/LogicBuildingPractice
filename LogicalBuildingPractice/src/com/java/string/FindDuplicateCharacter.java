package com.java.string;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharacter {
    public static void main(String[] args) {
        String str = "Rishabh Singh";
        char[] ch = str.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<=ch.length -1; i++){
            if(Character.isAlphabetic(ch[i]))
                map.put(ch[i],map.getOrDefault(ch[i],0)+1);
        }
        System.out.println(map);
        for(Map.Entry<Character,Integer> m :map.entrySet()){
            if(m.getValue()>1){
                System.out.println(m.getKey());
            }
        }
    }
}
