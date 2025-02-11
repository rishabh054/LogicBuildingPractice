package com.java.arrays;

import java.util.Arrays;

public class MoveAllZeroAndOnes {
    public static void main(String[] args) {
        int[] array = {1, 1, 1, 0, 1, 0, 1, 1, 0, 0, 0, 0};
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            if (array[left] == 0 && array[right] == 1) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            } else if (array[left] == 1) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
