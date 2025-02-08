package com.java.topics.streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9,2,3,4,5);
        Set<Integer> s = new HashSet<>();
        List<Integer> l = list.stream().filter(sh->!s.add(sh)).collect(Collectors.toList());
        System.out.println(l);
    }
}
