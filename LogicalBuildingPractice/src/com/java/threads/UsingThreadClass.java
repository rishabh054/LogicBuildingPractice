package com.java.threads;

class UsingThreadClass extends Thread{
    @Override
    public void run(){
        System.out.println("1 Current Thread :" + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        UsingThreadClass t = new UsingThreadClass();
        t.start();
        System.out.println("1 Current Thread :" + Thread.currentThread().getName());
    }
}

