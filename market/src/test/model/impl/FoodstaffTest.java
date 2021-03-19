package model.impl;

import exception.ProductIllegalArgumentException;
import model.Product;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class FoodstaffTest {
    private final String goodName = "Иван";
    private final float goodPrice = 10;
    private final int goodQuantity = 5;
    private final int goodCalorieContent = 100;
    private final int badCalorieContent = -100;
    private final LocalDateTime goodExpirationDate = LocalDateTime.of(2025, 5, 30, 5, 30);
    private final LocalDateTime badExpirationDate = LocalDateTime.of(2000, 5, 30, 5, 30);
    Product foodstaff;


    @Test
    public void constructor() {
        foodstaff = new Foodstaff(goodName, goodPrice, goodQuantity, goodCalorieContent, goodExpirationDate) {
        };
    }

    @Test(expected = ProductIllegalArgumentException.class)
    public void constructorBadCalorieContent() {
        foodstaff = new Foodstaff(goodName, goodPrice, goodQuantity, badCalorieContent, goodExpirationDate) {
        };
    }

    @Test(expected = ProductIllegalArgumentException.class)
    public void constructorBadExpirationDate() {
        foodstaff = new Foodstaff(goodName, goodPrice, goodQuantity, goodCalorieContent, badExpirationDate) {
        };
    }

    @Test
    public void getCalorieContent() {
        foodstaff = new Foodstaff(goodName, goodPrice, goodQuantity, goodCalorieContent, goodExpirationDate) {
        };
        Assert.assertEquals(((Foodstaff) foodstaff).getCalorieContent(), goodCalorieContent);
    }

    @Test
    public void setGoodCalorieContent() {
        foodstaff = new Foodstaff(goodName, goodPrice, goodQuantity, goodCalorieContent, goodExpirationDate) {
        };
        ((Foodstaff) foodstaff).setCalorieContent(goodCalorieContent);
    }

    @Test(expected = ProductIllegalArgumentException.class)
    public void setBadCalorieContent() {
        foodstaff = new Foodstaff(goodName, goodPrice, goodQuantity, goodCalorieContent, goodExpirationDate) {
        };
        ((Foodstaff) foodstaff).setCalorieContent(badCalorieContent);
    }

    @Test
    public void getExpirationDate() {
        foodstaff = new Foodstaff(goodName, goodPrice, goodQuantity, goodCalorieContent, goodExpirationDate) {
        };
        Assert.assertEquals(((Foodstaff) foodstaff).getExpirationDate(), goodExpirationDate);
    }

    @Test
    public void setGoodExpirationDate() {
        foodstaff = new Foodstaff(goodName, goodPrice, goodQuantity, goodCalorieContent, goodExpirationDate) {
        };
        ((Foodstaff) foodstaff).setExpirationDate(goodExpirationDate);
    }

    @Test(expected = ProductIllegalArgumentException.class)
    public void setBadExpirationDate() {
        foodstaff = new Foodstaff(goodName, goodPrice, goodQuantity, goodCalorieContent, goodExpirationDate) {
        };
        ((Foodstaff) foodstaff).setExpirationDate(badExpirationDate);
    }
}