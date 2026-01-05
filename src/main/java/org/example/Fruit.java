package org.example;

public class Fruit extends Product {

    public Fruit(int id, String name, int price, int quantity) {
        super(id, name, price, quantity);
    }

    @Override
    String getDescription() {
        return "Fruit - " + getName() + ",Price: " + getPrice() + "kr, Quantity: " + getQuantity();
    }
}
