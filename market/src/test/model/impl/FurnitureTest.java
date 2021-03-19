package model.impl;

import exception.ProductIllegalArgumentException;
import model.Parameter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FurnitureTest {
    private final String goodName = "Иван";
    private final float goodPrice = 10;
    private final int goodQuantity = 5;
    private final Parameter parameter = new Parameter(10, 5, 2);
    private final float goodWeight = 50;
    private final float badWeight = -50;
    private final double delta = 0.0;

    private Furniture testFurniture;
    private Furniture furniture;

    @Before
    public void setDrinkTest() {
        testFurniture = new Furniture(goodName, goodPrice, goodQuantity, parameter, goodWeight);
    }

    @Test
    public void constructor() {
        furniture = new Furniture(goodName, goodPrice, goodQuantity, parameter, goodWeight);
    }

    @Test(expected = ProductIllegalArgumentException.class)
    public void constructorBadWeight() {
        furniture = new Furniture(goodName, goodPrice, goodQuantity, parameter, badWeight);
    }

    @Test
    public void getParameter() {
        Assert.assertSame(testFurniture.getParameter(),parameter);
    }

    @Test
    public void setParameter() {
        testFurniture.setParameter(parameter);
    }

    @Test
    public void getWeight() {
        Assert.assertEquals(testFurniture.getWeight(),goodWeight,delta);
    }

    @Test
    public void setGoodWeight() {
        testFurniture.setWeight(goodWeight);
    }

    @Test(expected = ProductIllegalArgumentException.class)
    public void setBadWeight() {
        testFurniture.setWeight(badWeight);
    }
}