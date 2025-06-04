package com.java.threads;

public class DemoThreadClass {
    public static void main(String[] args) {
        CounterClass c = new CounterClass();
        Thread1 t1 = new Thread1();
        t1.m1(c);
        Thread2 t2 = new Thread2();
        t2.m1(c);

        t1.start();
        t2.start();
        System.out.println("Count " + c.getCount());
    }
}
