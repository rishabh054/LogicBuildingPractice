package com.java.threads;

public class ProducerConsumerMainClass {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Thread t2 = new Thread(()->{
            try {
                sharedResource.consumeItem();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t1 = new Thread(()->{
            sharedResource.produceItem();
        });
        t1.start();
        t2.start();
    }
}
