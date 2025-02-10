package com.java.arrays;

import java.util.HashMap;

public class Sum_2_optimized {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 10;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int diff = target - array[i];
            if (hashMap.containsKey(diff)) {
                System.out.println(diff + " and " + array[i]);
            } else {
                hashMap.put(array[i], i);
            }
        }
    }
}
