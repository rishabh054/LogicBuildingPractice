package com.java.patterns;

public class Pattern6 {

    //******
    // *****
    //  ****
    //   ***
    //    **
    //     *
    public static void main(String[] args) {
        int n= 5;
        int t=0;
        for(int i=0;i<=n;i++) {
            for(int j=0;j<=n;j++) {
                if(j>=t) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            t++;
            System.out.println();
        }
    }
}
