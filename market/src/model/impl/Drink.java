package model.impl;

import java.time.LocalDateTime;

/**
 * Класс товаров представляющих собой напитки.
 *
 * @author Valeriy Burlakov
 * @version 1.0
 */
public class Drink extends Foodstaff {
    /**
     * Показатель обьема единицы товара.
     */
    private float volume;

    /**
     * Конструктор класса, принимает все переменные класса.
     *
     * @param name           Название товара.
     * @param price          Цена товара.
     * @param quantity       Количество товара.
     * @param calorieContent Каллорийность товара.
     * @param expirationDate Дата выхода срока годности.
     * @param volume         Обьем единицы товара.
     */
    public Drink(String name, float price, int quantity, int calorieContent, LocalDateTime expirationDate, float volume) {
        super(name, price, quantity, calorieContent, expirationDate);
        this.volume = volume;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }
}
