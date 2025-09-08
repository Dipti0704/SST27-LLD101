

public class Demo01 {
    public static void main(String[] args) {
        TaxCalculator tax = new TaxCalculator(0.18);
        Message message =  new EmailClient();
        new OrderService(tax,message).checkout("a@shop.com", 100.0);
    }
}

// before my OrderSerivce was calculating tax and handeling the checkout . so in future if tax rule changed or message sending changes so mulitple things have to change 
// so we moved tax calculation into a seperate class : because according to SRP each class should have only one reason to change 

// before my orderService used emailClient which was envolving Tight coupling → could not send SMS/Push without editing OrderService.
// so we created a new interface  message  and implemented sending email in that and injected it to orderSerivce. bcause the high level module should depend on abstrctions.
