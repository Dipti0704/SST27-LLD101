public class Demo03 {
    public static void main(String[] args) {
        ShippingCostCalculator calc = new ShippingCostCalculator();

        Shipment shipment1 = new Shipment("STANDARD", 5.0);
        Shipment shipment2 = new Shipment("EXPRESS", 2.0);
        Shipment shipment3 = new Shipment("OVERNIGHT", 1.0);

        System.out.println("Standard Shipping: " + calc.cost(shipment1));
        System.out.println("Express Shipping: " + calc.cost(shipment2));
        System.out.println("Overnight Shipping: " + calc.cost(shipment3));
    }
}

// Before , the ShippingCostCalculator both decided the type and contained all formulas.  so srp rule was not being followed  
// so we moved formulas to seperate classes  , so now each class will have only one reason to change.