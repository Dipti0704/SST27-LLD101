public class OvernightShipping implements ShippingMethod {
    @Override
    public double cost(Shipment shipment) {
        return 120 + 10 * shipment.weightKg;
    }
}