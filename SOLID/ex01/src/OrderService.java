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