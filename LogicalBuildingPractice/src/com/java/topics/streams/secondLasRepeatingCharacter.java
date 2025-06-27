package com.java.topics.streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class secondLasRepeatingCharacter {
    public static void main(String[] args) {
        String str = "RishabhKumarSingh";

        Stream<Map.Entry<Character, Long>> map = str.chars().mapToObj(c -> (char) c).collect
                (Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
                .stream().filter(s -> s.getValue() == 1);


    }
}
