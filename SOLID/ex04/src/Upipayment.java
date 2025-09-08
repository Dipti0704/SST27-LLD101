public class Upipayment implements PaymentMode {
    @Override
    public String pay(double amount) {
        return "Paid via UPI: " + amount;
    }
}