package com.java.topics.streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class NthDistinctElementInList {

    public static void main(String[] args) {
        int index = 4;
        List<Integer> list = Arrays.asList(1, 2, 4, 2, 4, 3, 3, 5, 5, 6, 4, 7, 5, 9, 7, 6, 5, 6);
        Integer element = findDistinctElement(list, index);
        Integer element1 = findDuplicateElement(list, index);
        System.out.println(element1);

    }

    private static Integer findDuplicateElement(List<Integer> list, int index) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> list1 = list.stream()
                .filter(a -> !set.add(a))
                .collect(Collectors.toSet());
        ;
        System.out.println(set);
        System.out.println(list1);

        return list.stream()
                .filter(a -> !set.add(a))
                .toList().get(index);

    }

    private static Integer findDistinctElement(List<Integer> list, int index) {
        return list.stream().distinct().toList().get(index - 1);
    }
}
