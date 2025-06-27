package com.java.topics.streams;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CountOfCharacter {
    public static void main(String[] args) {
        String s = "rishabh kumar singh";

        Map<Character, Long> t = s.chars()
                .mapToObj(c->(char) c)
                .filter(t1 ->Character.isAlphabetic(t1))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(t);
    }
}
