
public class Demo04 {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();

        Payment p1 = new Payment("CARD", 999);
        Payment p2 = new Payment("UPI", 499);
        Payment p3 = new Payment("WALLET", 299);

        System.out.println(paymentService.pay(p1));
        System.out.println(paymentService.pay(p2));
        System.out.println(paymentService.pay(p3));    }
}


// before our PaymentService has multiple responsibilites  provider and  payment logiv so it voilated the SRP..
// so what we did is we created the PaymentMode interface , extracted each provider's logic in seperate class 
//OCP DIP is pending