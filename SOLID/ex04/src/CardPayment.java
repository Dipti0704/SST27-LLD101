public class CardPayment implements PaymentMode {
    @Override
    public String pay(double amount) {
        return "Charged card: " + amount;
    }
}