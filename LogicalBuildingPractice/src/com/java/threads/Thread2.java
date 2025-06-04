package com.java.threads;

public class Thread2 extends Thread{
    public void m1(CounterClass c){

            for(int i=1;i<=12000;i++){
                c.increaseCount();
            }

    }
}
