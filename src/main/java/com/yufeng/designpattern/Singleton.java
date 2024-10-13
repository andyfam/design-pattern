package com.yufeng.designpattern;

public class Singleton {
    private static volatile Singleton instance;

    private int data;

    private Singleton(int data) {
        this.data = data;
    }

    public void getData(){
        System.out.println("data value: " + data);
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

    public static void main(String[] args) {
        Singleton.getInstance(1).getData();
    }
}
