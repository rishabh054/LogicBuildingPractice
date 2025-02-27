package com.java.arrays;

import java.util.Arrays;

/**
 * Given an integer array nums, rotate the array to the left by 1 steps
 **/
public class RotateLeftBy1Position {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Before rotation = " + Arrays.toString(arr));
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
        System.out.println("After rotation =  " + Arrays.toString(arr));
    }

}
