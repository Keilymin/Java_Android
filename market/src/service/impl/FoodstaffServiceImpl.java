package service.impl;

import model.impl.Foodstaff;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * Класс расширяющий сервис продуктов магазина предназначеный для товаров имеющих пищевую ценность.
 *
 * @author Valeriy Burlakov
 * @version 1.0
 */
public class FoodstaffServiceImpl extends ProductServiceImpl {
    /**
     * Конструктор класса сервиса.
     */
    public FoodstaffServiceImpl() {
    }

    /**
     * Метод реализует проверку пищевого товара на истечение срока годности.
     *
     * @param foodstaff Пищевой товар.
     * @return испорчен ли товар.
     */
    public boolean isExpirationDate(Foodstaff foodstaff) {
        return foodstaff.getExpirationDate().isBefore(LocalDateTime.now());

    }

    /**
     * Метод реализует подсчет каллорий в массиве пищевых товаров.
     *
     * @param foodstaffs Массив пищевых товаров
     * @return Общая сумма каллорий.
     */
    public int calculateTotalCalorieContent(ArrayList<Foodstaff> foodstaffs) {
        int sum = 0;
        for (Foodstaff i : foodstaffs) {
            sum += i.getCalorieContent() * i.getQuantity();
        }
        return sum;
    }
}
