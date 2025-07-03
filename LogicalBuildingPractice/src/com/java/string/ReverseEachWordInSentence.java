package com.java.string;

public class ReverseEachWordInSentence {
    public static void main(String[] args) {
        String str = "the sky is blue";
        StringBuffer sb = new StringBuffer();
        String[] trim = str.trim().split("\\s+");
        for(int i= trim.length -1;i>=0;i--){
            sb.append(trim[i]);
            if(i !=0){
                sb.append(" ");
            }
        }
        System.out.println(sb.toString());
    }
}
