package com.java.patterns;

public class ParalelloGram {
    // *****
    //  *****
    //   *****
    //    *****
    //     *****

    public static void main(String[] args) {
        int n=5;
        int t=0;
        for (int i=0;i<=n;i++) {
            for(int j=0;j<=(n+i);j++) {
                if(t<=j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            t++;
            System.out.println();
        }
    }
}
