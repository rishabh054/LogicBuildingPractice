package com.java.arrays;

import java.util.HashSet;
import java.util.Set;

public class CountUniqueElementUsingList {
    public static void main(String[] args) {
        int[] arr = {1,1,5,4,3,6,4,5,2,7,8,9};
        System.out.println(countUniqueElement(arr));
    }

    public static int countUniqueElement(int[] arr){
        Set<Integer> set = new HashSet<>();
        for(int i =0;i<arr.length;i++){
            set.add(arr[i]);
        }
        return set.size();
    }
}
