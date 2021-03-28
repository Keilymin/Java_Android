package model.impl;

import exception.ProductIllegalArgumentException;
import model.Product;
import org.junit.Assert;
import org.junit.Test;

public class AbstractProductTest {

    private final String goodName = "Иван";
    private final String badName = "";
    private final float goodPrice = 10;
    private final float badPrice = -10;
    private final int goodQuantity = 5;
    private final int badQuantity = -5;
    private final double delta = 0.0;
    private Product product;


    @Test
    public void constructor() {
        product = new AbstractProduct(goodName, goodPrice, goodQuantity) {
        };
    }

    @Test(expected = ProductIllegalArgumentException.class)
    public void constructorBadName() {
        product = new AbstractProduct(badName, goodPrice, goodQuantity) {
        };
    }

    @Test(expected = ProductIllegalArgumentException.class)
    public void constructorBadPrice() {
        product = new AbstractProduct(goodName, badPrice, goodQuantity) {
        };
    }

    @Test(expected = ProductIllegalArgumentException.class)
    public void constructorBadQuantity() {
        product = new AbstractProduct(goodName, goodPrice, badQuantity) {
        };
    }
    @Test(expected = NullPointerException.class)
    public void constructorNullName() {
        product = new AbstractProduct(null, goodPrice, goodQuantity) {
        };
    }
    @Test
    public void getName() {
        product = new AbstractProduct(goodName, goodPrice, goodQuantity) {
        };
        Assert.assertEquals(((AbstractProduct) product).getName(), goodName);
    }

    @Test
    public void setGoodName() {
        product = new AbstractProduct(goodName, goodPrice, goodQuantity) {
        };
        ((AbstractProduct) product).setName(goodName);
    }

    @Test(expected = ProductIllegalArgumentException.class)
    public void setBadName() {
        product = new AbstractProduct(goodName, goodPrice, goodQuantity) {
        };
        ((AbstractProduct) product).setName(badName);
    }
    @Test
    public void getPrice() {
        product = new AbstractProduct(goodName, goodPrice, goodQuantity) {};
        Assert.assertEquals(((AbstractProduct) product).getPrice(),goodPrice,delta);
    }

    @Test
    public void setGoodPrice() {
        product = new AbstractProduct(goodName, goodPrice, goodQuantity) {
        };
        ((AbstractProduct) product).setPrice(goodPrice);
    }
    @Test(expected = ProductIllegalArgumentException.class)
    public void setBadPrice() {
        product = new AbstractProduct(goodName, goodPrice, goodQuantity) {
        };
        ((AbstractProduct) product).setPrice(badPrice);
    }
    @Test
    public void getQuantity() {
        product = new AbstractProduct(goodName, goodPrice, goodQuantity) {};
        Assert.assertEquals(((AbstractProduct) product).getQuantity(),goodQuantity);
    }

    @Test
    public void setGoodQuantity() {
        product = new AbstractProduct(goodName, goodPrice, goodQuantity) {
        };
        ((AbstractProduct) product).setQuantity(goodQuantity);
    }
    @Test(expected = ProductIllegalArgumentException.class)
    public void setBadQuantity() {
        product = new AbstractProduct(goodName, goodPrice, goodQuantity) {
        };
        ((AbstractProduct) product).setQuantity(badQuantity);
    }
    @Test
    public void calculateTotalPrice() {
        product = new AbstractProduct(goodName, goodPrice, goodQuantity) {
        };
        float totalPrice = goodPrice * goodQuantity;
        Assert.assertEquals(product.calculateTotalPrice(),totalPrice,delta);
    }

    @Test
    public void makeSale() {
        product = new AbstractProduct(goodName, goodPrice, goodQuantity) {
        };
        double sale = 0.5;
        float newPrice = (float) (goodPrice* sale);
        ((AbstractProduct) product).makeSale((float) sale);
        Assert.assertEquals(((AbstractProduct) product).getPrice(),newPrice,delta);
    }
}