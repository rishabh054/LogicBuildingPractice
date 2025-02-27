package com.java.arrays;

public class CheckArrayIsSorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 5, 5, 6, 7, 8, 8, 8, 8, 8, 9, 11, 56};

        System.out.println(checkIsSorted(arr));
    }

    public static boolean checkIsSorted(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= arr[i - 1]) {

            } else {
                return false;
            }
        }
        return true;
    }
}
