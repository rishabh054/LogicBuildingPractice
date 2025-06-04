package com.java.arrays;

import java.util.Arrays;

public class ProductOfArrayExceptItselfOptimized {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int n = arr.length;
        int[] prefix = new int[n];
        Arrays.fill(prefix, 1);
        int[] sufix = new int[n];
        Arrays.fill(sufix, 1);

        for (int i = 1; i < n; i++) {
            prefix[i] = arr[i - 1] * prefix[i - 1];
        }

        for (int i = n - 2; i >= 0; i--) {
            sufix[i] = arr[i + 1] * sufix[i + 1];
        }

        for (int i = 0; i < n; i++) {
            arr[i] = sufix[i] * prefix[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
