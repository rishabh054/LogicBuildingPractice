package com.java.patterns;

public class pattern5 {
    //                 *
//                    **
//                   ***
//                  ****
//                 *****
//                  ****
//                   ***
//                    **
//                     *
    public static void main(String[] args) {
        int n = 5;
        int t = n - 1;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n; j++) {
                if (j > t) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            t--;
            System.out.println();
        }
        for (int i = n; i <= 2 * n; i++) {
            for (int j = 0; j <= n; j++) {
                if (j >= temp) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            temp++;
            System.out.println();
        }
    }
}
