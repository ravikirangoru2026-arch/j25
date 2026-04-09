package com.dp.gof.str.adapter;

public class PayPalAdapter implements PaymentProcessor {
    private LegacyPayPalGateway payPal;

    public PayPalAdapter(LegacyPayPalGateway payPal) {
        this.payPal = payPal;
    }

    @Override
    public void processPayment(double amount) {
        payPal.sendPayment(amount, "USD");
    }
}
