package com.java.string;

public class IsPalindrome {
    public static void main(String[] args) {
        String str = "wbklpwm";
        int i = 0;
        int j=str.length()-1;
        boolean flag = true;
        while(i<=j){
            if(str.charAt(i) != str.charAt(j)){
                flag = false;
            }
            i++;
            j--;
        }
        if(flag == true){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
