package com.java.arrays;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3,4,4,5,6,7,7,8};
        System.out.println(removeDuplicates(arr));
    }

    public static int removeDuplicates(int[] nums) {
        int i=0;
        for(int j= 1;j<nums.length;j++){
            if(nums[j] != nums[i]){
                nums[i+1] = nums[j];
                i++;
            }
        }
        return i+1;
    }

    public static int countUniqueElement(int[] arr){
        Set<Integer> set = new HashSet<>();
        for(int i =0;i<arr.length;i++){
            set.add(arr[i]);
        }
        return set.size();
    }
}
