public class StandardShipping implements ShippingMethod {
    @Override
    public double cost(Shipment shipment) {
        return 50 + 5 * shipment.weightKg;
    }
}
