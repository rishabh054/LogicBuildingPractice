package com.java.arrays;

import java.util.Arrays;

public class ProductOfArrayExceptItself {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] arr1 = new int[arr.length];
        for(int i =0;i<arr.length;i++){
            int prod = 1;
            for(int j =0;j<arr.length;j++){
                if(i != j)
                   prod *= arr[j];
                arr1[i] = prod;
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}
