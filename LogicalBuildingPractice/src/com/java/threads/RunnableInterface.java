package com.java.threads;

public class RunnableInterface implements Runnable{
    @Override
    public void run() {
        System.out.println("running Thread"+ Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("before running Thread "+ Thread.currentThread().getName());
        RunnableInterface th = new RunnableInterface();
        Thread t1 = new Thread(th);
        t1.start();
        System.out.println("after running Thread"+ Thread.currentThread().getName());
    }
}
