package com.java.threads;

public class AtomicIntegerSharedResouceThreads {
    public static void main(String[] args) throws InterruptedException {
        AtomicIntegerSharedResource c = new AtomicIntegerSharedResource();
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 1200; i++) {
                c.increaseCount();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 1200; i++) {
                c.increaseCount();
            }
        });

        System.out.println("Current Thread :" + Thread.currentThread().getName());
        t1.start();
        System.out.println("Current Thread :" + Thread.currentThread().getName());
        t2.start();
        System.out.println("Current Thread :" + Thread.currentThread().getName());
        t1.join();
        System.out.println("Current Thread :" + Thread.currentThread().getName());
        t2.join();
        System.out.println("Current Thread :" + Thread.currentThread().getName());
        System.out.println("Count = "+ c.getCount());
    }
}
