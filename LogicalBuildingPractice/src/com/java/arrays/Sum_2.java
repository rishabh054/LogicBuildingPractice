package com.java.arrays;

public class Sum_2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 10;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length - 1; j++) {
                if (array[i] + array[j] == target) {
                    System.out.println("elements are " + array[i] + " and " + array[j]);
                }
            }
        }
    }
}
