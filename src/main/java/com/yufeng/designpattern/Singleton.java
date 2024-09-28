package com.yufeng.designpattern;

public class Singleton {
    private static volatile Singleton instance;

    private int data;

    private Singleton(int data) {
        this.data = data;
    }

    public static Singleton getInstance(int data) {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton(data);
                }
            }
        }

        return instance;
    }
}
