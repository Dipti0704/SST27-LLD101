public class TaxCalculator {
    private final double taxRate;

    public TaxCalculator(double taxRate){
        this.taxRate = taxRate;
    }
    public double totalWithTax(double subtotal){
        double taxTotal = subtotal + subtotal*taxRate;
        return taxTotal;
    }
}
