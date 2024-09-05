package com.java.patterns;

public class Paralellogram1 {
    //      *****
    //     *****
    //    *****
    //   *****
    //  *****
    public static void main(String[] args) {
        int n=5;
        int t=n-1;
        for(int i=0;i<n;i++) {
            for (int j=0;j<(2*n-1-i);j++){
                if(t<=j){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            t--;
            System.out.println();
        }
    }
}
