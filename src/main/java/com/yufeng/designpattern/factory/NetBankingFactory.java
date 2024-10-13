package com.yufeng.designpattern.factory;

public class NetBankingFactory implements IPaymentMethodFactory {
    public PaymentMethod getPaymentMethod() {
        return new NetBanking();
    }
}
