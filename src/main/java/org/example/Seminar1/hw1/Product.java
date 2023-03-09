package org.example.Seminar1.hw1;

public abstract class Product {
    protected static String name;
    protected static int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {Product.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        Product.price = price;
    }
}
