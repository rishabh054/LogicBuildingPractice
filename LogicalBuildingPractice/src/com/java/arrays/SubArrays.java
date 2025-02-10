package com.java.arrays;

public class SubArrays {
    public static void main(String[] args) {
        int[] array = {3,-4,5,4,-1,7,-8};
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i < array.length;i++){
            int sum =0;
            for(int j=i;j<array.length;j++){
                sum=sum+array[j];
                maxSum =Math.max(sum,maxSum);
            }
        }
        System.out.println("MaxSum = "+ maxSum);
    }
}
