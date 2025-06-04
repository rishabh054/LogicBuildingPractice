package com.java.topics.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,22,3,4,5,6,7,8,9);
        Optional<Integer> i = list.stream().max(Comparator.comparing(Integer::intValue));
        System.out.println(i);
    };
}
