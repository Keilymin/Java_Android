package model.impl;

import java.time.LocalDateTime;
import java.util.Date;

public class Drink extends Foodstaff {

    private float volume;

    public Drink(String name, float price, int quantity, int calorieContent, LocalDateTime expirationDate, float volume) {
        super(name, price, quantity, calorieContent, expirationDate);
        this.volume = volume;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }
}
