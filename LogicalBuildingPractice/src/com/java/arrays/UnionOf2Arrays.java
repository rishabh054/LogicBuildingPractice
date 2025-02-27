package com.java.arrays;

import java.util.*;

public class UnionOf2Arrays {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 16};
        int b[] = {1, 2, 3, 6, 7, 9, 22};
        ArrayList<Integer> union = findUnion(a, b);
        System.out.println(union);
    }

    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        ArrayList<Integer> array = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            set.add(b[i]);
        }
        for (int i : set) {
            array.add(i);
        }
        return array;
    }
}
