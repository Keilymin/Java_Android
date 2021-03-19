package service.impl;

import model.Parameter;
import model.Product;
import model.impl.AbstractProduct;
import model.impl.Drink;
import model.impl.Food;
import model.impl.Furniture;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class ProductServiceImplTest {
    private static double delta = 0.0;
    private static ArrayList<AbstractProduct> list = new ArrayList<>();
    private final ProductServiceImpl productService = new ProductServiceImpl();
    private static Food food;
    private static Furniture furniture;
    private static Drink drink;

    @BeforeClass
    public static void createList() {
        food = new Food("Хлеб 'Бородинский'", 10.5F, 37, 120,
                LocalDateTime.of(2022, 5, 5, 5, 5), 1);
        furniture = new Furniture("Диван 'Роскошь'", 15000, 8,
                new Parameter(150, 80, 30), 800);
        drink = new Drink("Йогурт 'Малина'",28,70,250,
                LocalDateTime.of(2022, 7, 5, 7, 5),1);
        list.add(food);
        list.add(furniture);
        list.add(drink);
    }

    @Test
    public void calculateTotalAmount() {
        float total = food.calculateTotalPrice()+drink.calculateTotalPrice()+furniture.calculateTotalPrice();
        Assert.assertEquals(productService.calculateTotalAmount(list),total,delta);
    }

    @Test
    public void searchByName() {
        ArrayList<AbstractProduct> list1 = new ArrayList<>();
        list1.add(drink);
        Assert.assertEquals(productService.searchByName(list,drink.getName()),list1);
    }
}