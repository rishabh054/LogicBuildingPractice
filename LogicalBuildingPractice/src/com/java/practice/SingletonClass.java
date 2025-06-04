package com.java.practice;

public class SingletonClass {

    private static volatile SingletonClass obj = null;

    private SingletonClass() {
    }

    private static SingletonClass getInstance() {
        if (obj == null) {
            synchronized (SingletonClass.class) {
                if (obj == null) {
                    obj= new SingletonClass();
                }
            }
        }
        return obj;
    }

}
