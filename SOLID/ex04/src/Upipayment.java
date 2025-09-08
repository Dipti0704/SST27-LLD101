public class UpiPayment implements PaymentMode {
    @Override
    public String pay(double amount) {
        return "Paid via UPI: " + amount;
    }
}