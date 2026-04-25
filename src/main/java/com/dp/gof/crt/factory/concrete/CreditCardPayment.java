package com.dp.gof.crt.factory.concrete;

import com.dp.gof.crt.factory.enums.PaymentTypes;
import com.dp.gof.crt.factory.contract.PaymentProcessor;

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
