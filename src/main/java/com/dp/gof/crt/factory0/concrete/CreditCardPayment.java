package com.dp.gof.crt.factory0.concrete;

import com.dp.gof.crt.factory0.enums.PaymentTypes;
import com.dp.gof.crt.factory0.contract.PaymentProcessor;

// Step 2: Concrete implementations
public class CreditCardPayment implements PaymentProcessor
{

    @Override
    public void process(double amount) {
        System.out.println("Processing Credit Card payment: ₹" + amount);
    }

    @Override
    public PaymentTypes getType() {
        return PaymentTypes.CREDIT;
    }
}
