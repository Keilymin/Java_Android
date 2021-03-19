package model;

import exception.ProductIllegalArgumentException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ParameterTest {
    private final float goodHeight = 5.0F;
    private final float badHeight = -5.0F;
    private final float goodWeight = 2.5F;
    private final float badWeight = -2.5F;
    private final float goodLength = 7.3F;
    private final float badLength = -7.0F;
    private final double delta = 0.0;
    private Parameter testParameter;
    private Parameter parameter;

    @Before
    public void setParameterTest() {
        testParameter = new Parameter(goodHeight, goodWeight, goodLength);
    }

    @Test
    public void constructor() {
        parameter = new Parameter(goodHeight, goodWeight, goodLength);
    }

    @Test(expected = ProductIllegalArgumentException.class)
    public void constructorBadHeight() {
        parameter = new Parameter(badHeight, goodWeight, goodLength);
    }

    @Test(expected = ProductIllegalArgumentException.class)
    public void constructorBadWeight() {
        parameter = new Parameter(goodHeight, badWeight, goodLength);
    }

    @Test(expected = ProductIllegalArgumentException.class)
    public void constructorBadLength() {
        parameter = new Parameter(goodHeight, goodWeight, badLength);
    }

    @Test
    public void getHeight() {
        Assert.assertEquals(testParameter.getHeight(), goodHeight, delta);
    }

    @Test
    public void setGoodHeight() {
        testParameter.setHeight(goodHeight);
    }

    @Test(expected = ProductIllegalArgumentException.class)
    public void setBadHeight() {
        testParameter.setHeight(badHeight);
    }

    @Test
    public void getWeight() {
        Assert.assertEquals(testParameter.getWeight(), goodWeight, delta);
    }

    @Test
    public void setGoodWeight() {
        testParameter.setWeight(goodWeight);
    }

    @Test(expected = ProductIllegalArgumentException.class)
    public void setBadWeight() {
        testParameter.setWeight(badWeight);
    }

    @Test
    public void getLength() {
        Assert.assertEquals(testParameter.getLength(), goodLength, delta);
    }

    @Test
    public void setGoodLength() {
        testParameter.setLength(goodLength);
    }

    @Test(expected = ProductIllegalArgumentException.class)
    public void setBadLength() {
        testParameter.setLength(badLength);
    }
}