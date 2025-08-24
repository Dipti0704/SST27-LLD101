public class ShippingCostCalculator {
    double cost(Shipment s){
         if ("STANDARD".equals(s.type)) {
            return new StandardShipping().cost(s);
        }
        if ("EXPRESS".equals(s.type)) {
            return new ExpressShipping().cost(s);
        }
        if ("OVERNIGHT".equals(s.type)) {
            return new OvernightShipping().cost(s);
        }
        throw new IllegalArgumentException("Unknown type: " + s.type);
    }
}

// here is a voilation of SRP .  as if calculation logic changes so we have to change more than one thing in the class.
// and since each time we have to change the logic so it is closed for extension also. 