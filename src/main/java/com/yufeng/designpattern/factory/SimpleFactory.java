package com.yufeng.designpattern.factory;

public class SimpleFactory {

    public static PaymentMethod getPaymentMethod(String method) {
        if ("creditcard".equalsIgnoreCase(method)) {
            return new CreditCard();
        } else if ("netbanking".equalsIgnoreCase(method)) {
            return new NetBanking();
        } else {
            throw new IllegalArgumentException("Payment method not supported!");
        }
    }

    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();
        PaymentMethod paymentMethod = factory.getPaymentMethod("creditcard");
        paymentMethod.makePayment();
    }
}
