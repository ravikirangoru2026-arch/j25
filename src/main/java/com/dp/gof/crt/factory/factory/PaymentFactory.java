package com.dp.gof.crt.factory.factory;

import com.dp.gof.crt.factory.concrete.CreditCardPayment;
import com.dp.gof.crt.factory.concrete.CryptoPayment;
import com.dp.gof.crt.factory.concrete.UpiPayment;
import com.dp.gof.crt.factory.enums.PaymentTypes;
import com.dp.gof.crt.factory.contract.PaymentProcessor;

public class PaymentFactory {
    public static PaymentProcessor create(PaymentTypes type) {
        switch (type) {
            case PaymentTypes.CREDIT: return new CreditCardPayment();
            case PaymentTypes.UPI:    return new UpiPayment();
            case PaymentTypes.CRYPTO: return new CryptoPayment();
            default: throw new IllegalArgumentException("Unknown payment type: " + type);
        }
    }
}
