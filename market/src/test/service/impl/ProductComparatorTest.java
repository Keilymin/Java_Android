package service.impl;

import model.Parameter;
import model.impl.AbstractProduct;
import model.impl.Drink;
import model.impl.Food;
import model.impl.Furniture;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.Arrays;

import static org.junit.Assert.*;

public class ProductComparatorTest {
    private static Food food;
    private static Furniture furniture;
    private static Drink drink;
    static AbstractProduct[] ap;

    @BeforeClass
    static public void setArr() {
        food = new Food("Хлеб 'Бородинский'", 10.5F, 37, 120,
                LocalDateTime.of(2022, 5, 5, 5, 5), 1);
        furniture = new Furniture("Диван 'Роскошь'", 15000, 8,
                new Parameter(150, 80, 30), 800);
        drink = new Drink("Йогурт 'Малина'", 28, 70, 250,
                LocalDateTime.of(2022, 7, 5, 7, 5), 1);
        ap = new AbstractProduct[]{food, null, furniture, drink, null};
    }

    @Test
    public void compare() {
        AbstractProduct[] ap1 = {furniture, drink, food, null, null};
        Arrays.sort(ap,new ProductComparator());
        Assert.assertArrayEquals(ap,ap1);
    }
}