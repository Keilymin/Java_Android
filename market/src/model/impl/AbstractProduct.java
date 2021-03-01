package model.impl;

import model.Product;
import model.Promotional;

public abstract class AbstractProduct implements Product, Promotional {
    private String name;
    private float price;
    private int quantity;

    public AbstractProduct(String name, float price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public float calculateTotalPrice() {
        return price*quantity;
    }

    @Override
    public void makeSale(float percent) {
        setPrice(getPrice()-(getPrice()*percent));
    }
}
