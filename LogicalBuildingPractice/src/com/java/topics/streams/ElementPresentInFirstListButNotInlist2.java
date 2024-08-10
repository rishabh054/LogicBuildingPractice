package com.java.topics.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ElementPresentInFirstListButNotInlist2 {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 15);
        List<Integer> l2 = Arrays.asList(1, 3, 4, 7, 9);
        List<Integer> l3 = new ArrayList<>();

        for (int i = 0; i < l1.size(); i++) {
            int element = l1.get(i);
            if (!l2.contains(element)) {
                l3.add(element);
            }
        }
        System.out.println(l3);
    }
}
