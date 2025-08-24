public class ExpressShipping implements ShippingMethod {
    @Override
    public double cost(Shipment shipment) {
        return 80 + 8 * shipment.weightKg;
    }
}