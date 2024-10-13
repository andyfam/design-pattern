package com.yufeng.designpattern.factory;

public class CreditCard implements PaymentMethod {
    public void makePayment() {
        System.out.println("Payment through credit card...");
    }
}
