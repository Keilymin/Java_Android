package model.impl;

import java.time.LocalDateTime;
import java.util.Date;

public class Foodstaff extends AbstractProduct {

    private int calorieContent;
    private LocalDateTime expirationDate;

    public Foodstaff(String name, float price, int quantity, int calorieContent, LocalDateTime expirationDate) {
        super(name, price, quantity);
        this.calorieContent = calorieContent;
        this.expirationDate = expirationDate;
    }

    public int getCalorieContent() {
        return calorieContent;
    }

    public void setCalorieContent(int calorieContent) {
        this.calorieContent = calorieContent;
    }

    public LocalDateTime getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDateTime expirationDate) {
        this.expirationDate = expirationDate;
    }
}
