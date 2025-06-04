package com.java.threads;

public class OddEvanThread {
    public static void main(String[] args) throws InterruptedException {
        OddEvanPrinter printer = new OddEvanPrinter(10);

        Thread t1 = new Thread(()->{
            try {
                printer.printEvan();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t2 = new Thread(()->{
            try {
                printer.printOdd();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t1.start();
        t2.start();

    }
}
