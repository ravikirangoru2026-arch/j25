package com.dp.gof.crt.factory0.concrete;

import com.dp.gof.crt.factory0.enums.PaymentTypes;
import com.dp.gof.crt.factory0.contract.PaymentProcessor;

public class CryptoPayment implements PaymentProcessor {
    @Override
    public void process(double amount) {
        System.out.println("Processing Crypto payment: ₹" + amount);
    }

    @Override
    public PaymentTypes getType() {
        return PaymentTypes.CRYPTO;
    }
}