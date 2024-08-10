package com.java.topics.streams;

import java.util.Arrays;
import java.util.List;

public class ReverseEachStringInList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("rishabh","Pavan");
        List<StringBuilder> reverseString = list.stream().map(s->new StringBuilder(s).reverse()).toList();
        System.out.println(reverseString);
    }
}
