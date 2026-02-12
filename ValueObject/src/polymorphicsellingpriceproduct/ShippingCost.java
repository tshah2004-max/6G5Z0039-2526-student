package polymorphicsellingpriceproduct;

import java.util.Objects;

public class ShippingCost {
    public static final ShippingCost NO_SHIPPING_COST = new ShippingCost();
    private static final double ZERO = 0.0d;
    final private double value;

    private ShippingCost(){
        this(ZERO);
    }

    public ShippingCost(double value) {
        if (value < 0.0) {
            throw new IllegalArgumentException("Shipping cost must be non-negative.");
        }
        this.value = value;
    }



    public double getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ShippingCost that = (ShippingCost) o;
        return Double.compare(value, that.value) == 0 && Objects.equals(ZERO, that.ZERO);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ZERO, value);
    }

    @Override
    public String toString() {
        return String.format("%.2f", value);
    }

}
