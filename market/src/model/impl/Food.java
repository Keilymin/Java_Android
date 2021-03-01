package model.impl;

import java.time.LocalDateTime;

public class Food extends Foodstaff {
    private float weigth;

    public Food(String name, float price, int quantity, int calorieContent, LocalDateTime expirationDate, float weigth) {
        super(name, price, quantity, calorieContent, expirationDate);
        this.weigth = weigth;
    }

    public float getWeigth() {
        return weigth;
    }

    public void setWeigth(float weigth) {
        this.weigth = weigth;
    }
}
