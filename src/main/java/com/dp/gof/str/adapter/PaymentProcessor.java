package com.dp.gof.str.adapter;

//Target interface (what client expects).
public interface PaymentProcessor {
    void processPayment(double amount);
}
