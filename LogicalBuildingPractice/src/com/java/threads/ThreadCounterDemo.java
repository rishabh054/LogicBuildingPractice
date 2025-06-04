package com.java.threads;

public class ThreadCounterDemo{

    public static void main(String[] args) throws InterruptedException {
        CounterClass c = new CounterClass();
        Thread t1 = new Thread(()->{
            for(int i=1;i<=12000;i++){
                c.increaseCount();
            }
        });

        Thread t2 = new Thread(()->{
            for(int i=1;i<=12000;i++){
                c.increaseCount();
            }
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("Count =" + c.getCount());
    }
}
