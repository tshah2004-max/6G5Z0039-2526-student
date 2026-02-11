package polymorphicsellingpriceproduct;

public class ShippingCost extends Product {

    public ShippingCost(FullPrice price, MinimumPrice minimumPrice, ShippingCost shippingCost) {
        super(price, minimumPrice, shippingCost);
    }
}
