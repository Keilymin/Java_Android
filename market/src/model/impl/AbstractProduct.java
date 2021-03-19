package model.impl;

import exception.ProductIllegalArgumentException;
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
        if (name.length() > 0) {
            this.name = name;
        } else {
            throw new ProductIllegalArgumentException("Имя товара не введено");
        }
        if (price >= 0) {
            this.price = price;
        } else {
            throw new ProductIllegalArgumentException("Цена товара не может быть отрицательной");
        }
        if (quantity >= 0) {
            this.quantity = quantity;
        } else {
            throw new ProductIllegalArgumentException("Количество товара не может быть отрицательным");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 0) {
            this.name = name;
        } else {
            throw new ProductIllegalArgumentException("Имя товара не введено");
        }
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        if (price >= 0) {
            this.price = price;
        } else {
            throw new ProductIllegalArgumentException("Цена товара не может быть отрицательной");
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
        } else {
            throw new ProductIllegalArgumentException("Количество товара не может быть отрицательным");
        }
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
