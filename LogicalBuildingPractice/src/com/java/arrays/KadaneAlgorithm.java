package com.java.arrays;

public class KadaneAlgorithm {
    public static void main(String[] args) {
        int[] array = {-2,1,-3,4,-1,2,1,-5,4};
        int maxSum = Integer.MIN_VALUE;
        int sum =0;
        for(int i=0; i < array.length;i++){
                sum=sum+array[i];
                maxSum =Math.max(sum,maxSum);
                if(sum < 0){
                    sum = 0;
                }
        }
        System.out.println("MaxSum = "+ maxSum);
    }
}
