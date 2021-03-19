package service.impl;

import model.Parameter;
import model.impl.*;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class FoodstaffServiceImplTest {
    private static double delta = 0.0;
    private static ArrayList<Foodstaff> list = new ArrayList<>();
    private final FoodstaffServiceImpl foodstaffService = new FoodstaffServiceImpl();
    private static Food food;
    private static Drink drink;

    @BeforeClass
    public static void createList() {
        food = new Food("Хлеб 'Бородинский'", 10.5F, 37, 120,
                LocalDateTime.of(2022, 5, 5, 5, 5), 1);
        drink = new Drink("Йогурт 'Малина'", 28, 70, 250,
                LocalDateTime.of(2022, 7, 5, 7, 5), 1);
        list.add(food);
        list.add(drink);
    }

    @Test
    public void isExpirationDateTrue() throws InterruptedException {
        Food f = new Food("Хлеб 'Бородинский'", 10.5F, 37, 120,
                LocalDateTime.now().plusSeconds(1), 1);
        Thread.sleep(2000);
        Assert.assertTrue(foodstaffService.isExpirationDate(f));
    }

    @Test
    public void isExpirationDateFalse() throws InterruptedException {
        Food f = new Food("Хлеб 'Бородинский'", 10.5F, 37, 120,
                LocalDateTime.now().plusYears(1), 1);
        Assert.assertFalse(foodstaffService.isExpirationDate(f));
    }

    @Test
    public void calculateTotalCalorieContent() {
        float total = food.getCalorieContent() * food.getQuantity() + drink.getCalorieContent() * drink.getQuantity();
        Assert.assertEquals(foodstaffService.calculateTotalCalorieContent(list), total, delta);
    }
}