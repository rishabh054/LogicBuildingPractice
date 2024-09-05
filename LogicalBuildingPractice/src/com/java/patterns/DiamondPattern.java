package com.java.patterns;

public class DiamondPattern {

//                           *
//                          ***
//                         *****
//                        *******
//                       *********
//                        *******
//                         *****
//                          ***
//                           *

    public static void main(String[] args) {
        int n = 15;
        int t = (n / 2)-1;
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) >= n / 2 && (i + j) < t) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            t = t + 2;
            System.out.println();
        }
        int temp = n / 2;
        for (int i = (n / 2); i <= n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) >= temp && (i + j) < t) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            temp = temp + 2;
            System.out.println();
        }
    }

}
