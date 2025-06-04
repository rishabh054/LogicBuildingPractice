package com.java.arrays;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 153;
        int temp = num;
        int digit =0;
        int sum =0;

        while(temp >0){
            temp = temp/10;
            digit++;
        }
        System.out.println("Digit "+ digit);
        while(num>0){
            sum = (int) (sum+Math.pow(num %10,digit));
            num = num/10;
        }
        System.out.println("sum "+ sum);
    }
}
