package polymorphicsellingpriceproduct;

class Product {

    private final MinimumPrice minimumPrice;
    private final ShippingCost shippingCost;
    private SellingPrice sellingPrice;

    public Product(FullPrice price, MinimumPrice minimumPrice, ShippingCost shippingCost) {
        this.sellingPrice = price;
        this.minimumPrice = minimumPrice;
        this.shippingCost = shippingCost;
    }

    public Product(FullPrice fullPrice, MinimumPrice minimumPrice, MinimumPrice minimumPrice1, ShippingCost shippingCost) {
        this.minimumPrice = minimumPrice1;
        this.shippingCost = shippingCost;
    }

    public void applyDiscount(Discount discount) {

        sellingPrice = sellingPrice.applyDiscount(minimumPrice, discount);
    }

    public void removeDiscount() {

        sellingPrice = sellingPrice.removeDiscount();
    }

    public double getPrice() {
        return sellingPrice.get();
    }

    public ShippingCost getShippingCost() {
        return shippingCost;
    }
}
