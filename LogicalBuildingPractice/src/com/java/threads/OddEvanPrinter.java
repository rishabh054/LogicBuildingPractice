package com.java.threads;

public class OddEvanPrinter {
    int count =1;
    int  limit;
    public OddEvanPrinter(int limit){
        this.limit = limit;
    }

    public synchronized void printOdd() throws InterruptedException {
        while(count <limit){
            while(count %2 ==0){
                wait();
            }
            System.out.println("Count = "+ count +" By "+ Thread.currentThread().getName());
            count++;
            notify();
        }
    }

    public synchronized void printEvan() throws InterruptedException {
        while(count <limit){
            while(count %2 !=0){
                wait();
            }
            System.out.println("Count = "+ count +" By "+ Thread.currentThread().getName());
            count++;
            notify();
        }
    }
}
