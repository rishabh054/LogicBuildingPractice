package com.java.number;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("A","abc");
        map.put("A","abc");
        System.out.println(map.get("A"));
        Map<Emp, String> map2 = new HashMap<>();
        map2.put(new Emp("A"),"XYZ");
        map2.put(new Emp("A"),"XYZ");
        System.out.println(map2.get(new Emp("A")));

    }
}
