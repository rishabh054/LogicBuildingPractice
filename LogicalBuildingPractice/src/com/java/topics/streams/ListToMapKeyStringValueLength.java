package com.java.topics.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMapKeyStringValueLength {
    //Use streams to create a map from a list of strings where the key is the string and the value is its length.
    public static void main(String[] args) {
        List<String> list = Arrays.asList("rishabh", "kumar", "Singh");
       Map<String, Integer> map = list.stream().collect(Collectors.toMap(s->s,s->s.length()));
        System.out.println(map);
    }
}
