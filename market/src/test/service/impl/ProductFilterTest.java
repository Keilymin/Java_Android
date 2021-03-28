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

import static org.junit.Assert.*;

public class ProductFilterTest {
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
        ap = new AbstractProduct[]{food, furniture, drink};
    }

    @Test
    public void filterName() {
        AbstractProduct[] ap1 = {null,furniture,null};
        ProductFilter.filterName(ap,"Диван 'Роскошь'");
        Assert.assertArrayEquals(ap,ap1);
    }
}