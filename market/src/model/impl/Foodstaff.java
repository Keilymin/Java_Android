package model.impl;

import java.time.LocalDateTime;

/**
 * Абстрактный класс для товаров имеющих пищевую ценность.
 *
 * @author Valeriy Burlakov
 * @version 1.0
 */
public abstract class Foodstaff extends AbstractProduct {
    /**
     * Показатель калорийности товара.
     */
    private int calorieContent;
    /**
     * Дата истечения срока годности.
     */
    private LocalDateTime expirationDate;

    /**
     * Конструктор класса, принимает все переменные класса.
     *
     * @param name           Название товара.
     * @param price          Цена товара.
     * @param quantity       Количество товара.
     * @param calorieContent Каллорийность товара.
     * @param expirationDate Дата выхода срока годности.
     */
    Foodstaff(String name, float price, int quantity, int calorieContent, LocalDateTime expirationDate) {
        super(name, price, quantity);
        if (calorieContent > 0) {
            this.calorieContent = calorieContent;
        } else {
            throw new IllegalArgumentException("Каллорийность продукта не может быть отрицательным или равным нулю");
        }
        if (expirationDate.isAfter(LocalDateTime.now())) {
            this.expirationDate = expirationDate;
        } else {
            throw new IllegalArgumentException("Срок годности продукта не может быть заведомо просрочен");
        }
    }

    public int getCalorieContent() {
        return calorieContent;
    }

    public void setCalorieContent(int calorieContent) {
        if (calorieContent > 0) {
            this.calorieContent = calorieContent;
        } else {
            throw new IllegalArgumentException("Каллорийность продукта не может быть отрицательным или равным нулю");
        }
    }

    public LocalDateTime getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDateTime expirationDate) {
        if (expirationDate.isAfter(LocalDateTime.now())) {
            this.expirationDate = expirationDate;
        } else {
            throw new IllegalArgumentException("Срок годности продукта не может быть заведомо просрочен");
        }
    }
}
