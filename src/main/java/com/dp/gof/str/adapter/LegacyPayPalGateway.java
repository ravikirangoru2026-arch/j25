package com.dp.gof.str.adapter;

public class LegacyPayPalGateway {
    public void sendPayment(double amount, String currency) {
        System.out.println("Legacy PayPal: Sending $" + amount + " " + currency);
    }
}
