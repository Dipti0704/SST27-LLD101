package com.example.payments;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<String, PaymentGateway> gateways = new HashMap<>();
        // TODO: register adapters instead of raw SDKs
         gateways.put("fastpay", new FastPayAdapter(new FastPayClient()));
         gateways.put("safecash", new SafeCashAdapter(new SafeCashClient()));
        OrderService svc = new OrderService(gateways);

        String id1 = svc.charge("fastpay", "cust-1", 1299);
        String id2 = svc.charge("safecash", "cust-2", 1299);
        System.out.println(id1);
        System.out.println(id2);
    }
}



/*
 * 
 * Step 1: FastPayAdapter

implements PaymentGateway

constructor: lega FastPayClient

method charge() me call karega fastPayClient.payNow(customerId, amountCents)

Step 2: SafeCashAdapter

implements PaymentGateway

constructor: lega SafeCashClient

method charge() me call karega:

pehle SafeCashPayment p = safeCashClient.createPayment(amountCents, customerId)

fir p.confirm() return karega.

Step 3: App.java

map me dono adapters register karo:

gateways.put("fastpay", new FastPayAdapter(new FastPayClient()));
gateways.put("safecash", new SafeCashAdapter(new SafeCashClient()));

Step 4: OrderService

ye already interface se kaam kar raha hai (PaymentGateway)

yaha koi change ki zarurat nahi hai (sirf provider branching remove ho gaya).
 */