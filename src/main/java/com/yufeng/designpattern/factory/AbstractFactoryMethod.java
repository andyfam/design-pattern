package com.yufeng.designpattern.factory;

public class AbstractFactoryMethod {

    public static void main(String[] args) {
        IPaymentMethodFactory factory = new CreditCardFactory();
        PaymentMethod paymentMethod = factory.getPaymentMethod();
        paymentMethod.makePayment();
    }
}
