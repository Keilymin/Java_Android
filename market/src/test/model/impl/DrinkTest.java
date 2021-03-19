package model.impl;

import exception.ProductIllegalArgumentException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;


public class DrinkTest {
    private final String goodName = "Иван";
    private final float goodPrice = 10;
    private final int goodQuantity = 5;
    private final int goodCalorieContent = 100;
    private final LocalDateTime goodExpirationDate = LocalDateTime.of(2025, 5, 30, 5, 30);
    private final float goodVolume = 2.0F;
    private final float badVolume = -2.0F;
    private final double delta = 0.0;

    private Drink drinkTest;
    private Drink drink;

    @Before
    public void setDrinkTest() {
        drinkTest = new Drink(goodName, goodPrice, goodQuantity, goodCalorieContent, goodExpirationDate, goodVolume);
    }

    @Test
    public void constructor() {
        drink = new Drink(goodName, goodPrice, goodQuantity, goodCalorieContent, goodExpirationDate, goodVolume) {
        };
    }

    @Test(expected = ProductIllegalArgumentException.class)
    public void constructorBadVolume() {
        drink = new Drink(goodName, goodPrice, goodQuantity, goodCalorieContent, goodExpirationDate, badVolume) {
        };
    }

    @Test
    public void getVolume() {
        Assert.assertEquals(drinkTest.getVolume(), goodVolume, delta);
    }

    @Test
    public void setGoodVolume() {
        drinkTest.setVolume(goodVolume);
    }

    @Test(expected = ProductIllegalArgumentException.class)
    public void setBadVolume() {
        drinkTest.setVolume(badVolume);
    }
}