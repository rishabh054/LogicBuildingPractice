package com.java.string;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Rishabh";
        int i = 0;
        int j=str.length()-1;
        char[] ch = str.toCharArray();
        while(i<=j){
            char c = ch[i];
            ch[i] = ch[j];
            ch[j] = c;
            i++;
            j--;
        }
        System.out.println(ch);
    }
}
