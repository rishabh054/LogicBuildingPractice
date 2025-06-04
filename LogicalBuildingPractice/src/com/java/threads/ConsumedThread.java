package com.java.threads;

public class ConsumedThread implements Runnable {
    public SharedResource sharedResource;
    public ConsumedThread(SharedResource sharedResource){
        this.sharedResource = sharedResource;
    }
    @Override
    public void run() {
        System.out.println("consumed method invoked by "+ Thread.currentThread().getName());
        try {
            sharedResource.consumeItem();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
