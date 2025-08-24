public class WalletPayment implements PaymentMode {
    @Override
    public String pay(double amount) {
        return "Wallet debit: " + amount;
    }
}
