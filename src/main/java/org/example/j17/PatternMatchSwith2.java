package org.example.j17;

record CCPayment(String cardNbr){}
record PLPayment(String cardNbr){}
record UPIPayment(String uipId){}

public class PatternMatchSwith2 {

    private static void prossesPmt(Object obj)
    {
        String result=switch(obj)
        {
            case CCPayment cc -> "CC payment CC nbr:"+cc.cardNbr();
            case PLPayment pl -> "PL payment PL nbr:"+pl.cardNbr();
            case UPIPayment upi -> "UPI payment UPI ID:"+upi.uipId();
            case Integer i -> "Amount paid:"+i;
            case null -> "Invalid payment";
            default -> "Unknow payment";
        };
        System.out.println(result);
    }

    static void main(String[] args) {
        prossesPmt(new CCPayment("CC123"));
        prossesPmt(new PLPayment("DC123"));
        prossesPmt(new UPIPayment("uid@ybl"));
        prossesPmt(500);
        prossesPmt(null);

    }
}
