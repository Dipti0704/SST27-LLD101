package com.example.payments;

public class SafeCashAdapter  implements PaymentGateway{
    private final SafeCashClient safeCashClient;

    public SafeCashAdapter(SafeCashClient safeCashClient){
        this.safeCashClient = safeCashClient;
    }

    @Override
    public String charge(String user, int amountCents){
        SafeCashPayment payment = safeCashClient.createPayment(amountCents, user);
        return payment.confirm();
    }
    
}
