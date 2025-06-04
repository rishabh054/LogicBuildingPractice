package com.java.threads;

public class ProducerThread implements Runnable {
    public SharedResource sharedResource;
    public ProducerThread(SharedResource sharedResource){
        this.sharedResource = sharedResource;
    }
    @Override
    public void run() {
        System.out.println("Produced method invoked by "+ Thread.currentThread().getName());
        sharedResource.produceItem();
    }
}
