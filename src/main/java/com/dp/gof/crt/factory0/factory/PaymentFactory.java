package com.dp.gof.crt.factory0.factory;

import com.dp.gof.crt.factory0.concrete.CreditCardPayment;
import com.dp.gof.crt.factory0.concrete.CryptoPayment;
import com.dp.gof.crt.factory0.concrete.UpiPayment;
import com.dp.gof.crt.factory0.enums.PaymentTypes;
import com.dp.gof.crt.factory0.contract.PaymentProcessor;

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
