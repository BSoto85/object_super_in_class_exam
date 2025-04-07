package org.example;

public class DiscountedProduct extends Product {
    double discountPercentage;

    public DiscountedProduct(String name, double price, String description, double discountPercentage) {
        super(name, price, description);
        this.discountPercentage = discountPercentage;
    }

    public double calculateDiscountedPrice() {
        double price = getPrice();
        return price - (discountPercentage/100 * price);
    }
}