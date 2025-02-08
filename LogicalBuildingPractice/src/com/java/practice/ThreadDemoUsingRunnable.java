package com.java.practice;

class MultiThreading implements Runnable{

    @Override
    public void run() {
        System.out.println(" 1 Current Thread :" + Thread.currentThread().getName());
    }
}
public class ThreadDemoUsingRunnable {
    public static void main(String[] args) {
        MultiThreading multiThreadingObj = new MultiThreading();
        Thread t = new Thread(multiThreadingObj);
        t.start();
        System.out.println(" 2 Current Thread :" + Thread.currentThread().getName());
    }

}
