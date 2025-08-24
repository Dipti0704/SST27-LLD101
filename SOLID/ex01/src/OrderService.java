public class OrderService {
    private final TaxCalculator tax;
    private final Message message;

    public OrderService(TaxCalculator tax, Message message){
        this.tax= tax;
        this.message= message;

    }
    
    void checkout(String customerEmail, double subtotal) {
        double total = tax.totalWithTax(subtotal);
        message.send(customerEmail, "Thanks! Your total is " + total);
        System.out.println("Order stored (pretend DB).");
    }
}

// what i am thinking is, instead of keeping totalwithtax nd sending email in orderservice we have to keep it seperately... either by creating interface or something else and then after doing the tax collection there then we can use that total amount....
// send email is also in orderservice... so its voilating the DIP rule.. dependency inversion principle... since this is the example of tighltly coupling .... why are we using orderservice to send emails.... that why it should be depended on abstractions.

