package polymorphicsellingpriceproduct;

public final class Example {

    public static void run() {
        FullPrice fullPrice = new FullPrice(100.0d);
        MinimumPrice minimumPrice = MinimumPrice.NO_MINIMUM;
        ShippingCost shippingCost = new ShippingCost(10.0d);
        Product product = new Product(fullPrice, minimumPrice, shippingCost);
        System.out.println("Before discount:");
        System.out.format("Selling Price: %.2f\n", product.getPrice());
        System.out.format("Shipping Cost: %s\n", product.getShippingCost());
        product.applyDiscount(new Discount(5.00));
        System.out.println("After discount:");
        System.out.format("Selling Price: %.2f\n", product.getPrice());
        System.out.format("Shipping Cost: %s\n", product.getShippingCost());
        product.removeDiscount();
        System.out.println("After removing discount:");
        System.out.format("Selling Price: %.2f\n", product.getPrice());
        System.out.format("Shipping Cost: %s\n", product.getShippingCost());
    }
}
