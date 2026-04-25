package com.dp.gof.crt.factory.contract;

import com.dp.gof.crt.factory.enums.PaymentTypes;

// Step 1: Define contract
public interface PaymentProcessor {
    void process(double amount);
    PaymentTypes getType();
}
