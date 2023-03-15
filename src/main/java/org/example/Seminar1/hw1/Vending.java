package org.example.Seminar1.hw1;
import java.util.ArrayList;
import java.util.List;

public class Vending <T> {

    private T id;
    private final List<T> products = new ArrayList<>();



    public T getProduct(){
        return id;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public List<T> allProducts(){
        return products;
    }

    public void addProduct(T pr){

        products.add(pr);

    }
}
