package model.impl;

import java.time.LocalDateTime;

/**
 * Класс товаров представляющих собой пищу.
 *
 * @author Valeriy Burlakov
 * @version 1.0
 */
public class Food extends Foodstaff {
    /**
     * Показатель веса единицы товара.
     */
    private float weight;

    /**
     * Конструктор класса, принимает все переменные класса.
     *
     * @param name           Название товара.
     * @param price          Цена товара.
     * @param quantity       Количество товара.
     * @param calorieContent Каллорийность товара.
     * @param expirationDate Дата выхода срока годности.
     * @param weight         Вес единицы товара.
     */
    public Food(String name, float price, int quantity, int calorieContent, LocalDateTime expirationDate, float weight) {
        super(name, price, quantity, calorieContent, expirationDate);
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
