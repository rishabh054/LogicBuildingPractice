package com.java.patterns;

public class ReversePyramid {
    public static void main(String[] args) {
        int n = 5;
        int temp = 1;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= (2 * n - 1); j++) {
                if ((i + j) >= temp && (i + j) <= (2 * n - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            temp = temp+2;
            System.out.println();
        }
    }
}
