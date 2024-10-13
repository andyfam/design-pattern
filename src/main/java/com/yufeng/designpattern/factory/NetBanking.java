package com.yufeng.designpattern.factory;

public class NetBanking implements PaymentMethod {
    public void makePayment() {
        System.out.println("Payment through net banking...");
    }
}
