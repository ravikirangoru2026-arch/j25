package com.dp.gof.str.adapter;

public class MainAdapterDemo {
    static void main(String[] args) {
        PaymentProcessor processor= new PayPalAdapter(new LegacyPayPalGateway());
        processor.processPayment(100.0);
    }
}
