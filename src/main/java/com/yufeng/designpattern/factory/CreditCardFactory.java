package com.yufeng.designpattern.factory;

public class CreditCardFactory implements IPaymentMethodFactory {

    public PaymentMethod getPaymentMethod() {
        return new CreditCard();
    }
}
