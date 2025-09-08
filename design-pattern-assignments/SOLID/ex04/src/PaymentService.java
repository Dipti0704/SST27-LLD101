
public class PaymentService {
    String pay(Payment p){
        switch (p.provider) {
            case "CARD": 
                return new CardPayment().pay(p.amount);
            case "UPI":  
                return new UpiPayment().pay(p.amount);
            case "WALLET": 
                return new WalletPayment().pay(p.amount);
            default: 
                throw new RuntimeException("No provider");
        }
    }
}