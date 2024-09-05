package com.java.patterns;

public class pyramid {

    //                           *
//                          ***
//                         *****
//                        *******
//                       *********
    public static void main(String[] args) {
        int n = 100;
        int temp = n - 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (2 * n - 1); j++) {
                if ((i + j) >= (n - 1) && (i + j) <= temp) {
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
