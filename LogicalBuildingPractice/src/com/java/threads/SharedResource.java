package com.java.threads;

import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {
    boolean res = false;

    public synchronized void produceItem(){
        res = true;
        System.out.println("Item added by "+ Thread.currentThread().getName());
        notifyAll();
    }

    public synchronized void consumeItem() throws InterruptedException {
        while(res!=true){
            System.out.println("Item waiting");
            wait();
        }
        res= false;
        System.out.println("Item consumed by "+ Thread.currentThread().getName());
    }
}
