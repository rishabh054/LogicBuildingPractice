package com.java.prep;

import java.util.List;

public class ImmutableClassMain {
    public static void main(String[] args) {
        ImmutableClass obj = new ImmutableClass("Rishabh", 1, List.of("math, science"));
        System.out.println("Name = " + obj.getName());
        System.out.println("Roll Number = " + obj.getRollNumber());
        System.out.println("Subject  = " + obj.getSubject());

    }


}
