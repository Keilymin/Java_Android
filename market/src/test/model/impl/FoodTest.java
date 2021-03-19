package model.impl;

import exception.ProductIllegalArgumentException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class FoodTest {

    private final String goodName = "Иван";
    private final float goodPrice = 10;
    private final int goodQuantity = 5;
    private final int goodCalorieContent = 100;
    private final LocalDateTime goodExpirationDate = LocalDateTime.of(2025, 5, 30, 5, 30);
    private final float goodWeight = 8.0F;
    private final float badWeight = -8.0F;
    private final double delta = 0.0;

    private Food foodTest;
    private Food food;

    @Before
    public void setDrinkTest() {
        foodTest = new Food(goodName, goodPrice, goodQuantity, goodCalorieContent, goodExpirationDate, goodWeight);
    }

    @Test
    public void constructor() {
        food = new Food(goodName, goodPrice, goodQuantity, goodCalorieContent, goodExpirationDate, goodWeight) {
        };
    }

    @Test(expected = ProductIllegalArgumentException.class)
    public void constructorBadVolume() {
        food = new Food(goodName, goodPrice, goodQuantity, goodCalorieContent, goodExpirationDate, badWeight) {
        };
    }

    @Test
    public void getWeight() {
        Assert.assertEquals(foodTest.getWeight(), goodWeight, delta);
    }

    @Test
    public void setGoodWeight() {
        foodTest.setWeight(goodWeight);
    }

    @Test(expected = ProductIllegalArgumentException.class)
    public void setBadWeight() {
        foodTest.setWeight(badWeight);
    }
}