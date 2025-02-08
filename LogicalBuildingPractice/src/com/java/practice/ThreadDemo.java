package com.java.practice;

class MultiThreadingUsingThread extends Thread{
    @Override
    public  void run(){
        System.out.println("1 Current Thread :" + Thread.currentThread().getName());
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        MultiThreadingUsingThread t = new MultiThreadingUsingThread();
        t.start();
        System.out.println("2 Current Thread :" + Thread.currentThread().getName());
    }
}
