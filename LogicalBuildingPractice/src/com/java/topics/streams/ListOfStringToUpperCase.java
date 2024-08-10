package com.java.topics.streams;

import java.util.Arrays;
import java.util.List;

public class ListOfStringToUpperCase {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("rishabh","foG");
        List<String> stringList = list.stream().map(s->s.toUpperCase()).toList();
        System.out.println(stringList);
    }
}
