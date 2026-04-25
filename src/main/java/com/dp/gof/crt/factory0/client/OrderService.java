package com.dp.gof.crt.factory0.client;

import com.dp.gof.crt.factory0.contract.PaymentProcessor;
import com.dp.gof.crt.factory0.enums.PaymentTypes;
import com.dp.gof.crt.factory0.factory.PaymentFactory;

public class OrderService {
    public void processPayment(PaymentTypes type, double amount) {
        PaymentProcessor processor = PaymentFactory.create(type);
        processor.process(amount);
    }

    static void main(String[] args) {
        OrderService obj = new OrderService();
        obj.processPayment(PaymentTypes.CRYPTO, 100.0);
        obj.processPayment(PaymentTypes.CREDIT, 120.0);
        obj.processPayment(PaymentTypes.UPI, 130.0);


    }
}
