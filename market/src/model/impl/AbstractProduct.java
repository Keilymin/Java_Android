package model.impl;

import model.Product;
import model.Promotional;

/**
 * Абстрактный класс товара магазина.
 *
 * @author Valeriy Burlakov
 * @version 1.0
 */
public abstract class AbstractProduct implements Product, Promotional {
    /**
     * Название товара
     */
    private String name;
    /**
     * Цена товара
     */
    private float price;
    /**
     * Количество товара.
     */
    private int quantity;

    /**
     * Конструктор класса, принимает все переменные класса.
     *
     * @param name     Название товара.
     * @param price    Цена товара.
     * @param quantity Количество товара.
     */
    AbstractProduct(String name, float price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private float getPrice() {
        return price;
    }

    private void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Реализует подсчет общей стоимости данного товара.
     *
     * @return Общая стоимость товара.
     */
    @Override
    public float calculateTotalPrice() {
        return price * quantity;
    }

    /**
     * Реализует создание скидки на товар.
     *
     * @param percent Значение процента скидки, где 1.0 это 100%
     */
    @Override
    public void makeSale(float percent) {
        setPrice(getPrice() - (getPrice() * percent));
    }
}
