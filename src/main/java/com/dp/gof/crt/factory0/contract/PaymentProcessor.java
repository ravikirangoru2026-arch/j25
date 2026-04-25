package com.dp.gof.crt.factory0.contract;

import com.dp.gof.crt.factory0.enums.PaymentTypes;

// Step 1: Define contract
public interface PaymentProcessor {
    void process(double amount);
    PaymentTypes getType();
}
