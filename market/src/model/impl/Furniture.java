package model.impl;

import exception.ProductIllegalArgumentException;
import model.Parameter;

/**
 * Класс товаров представляющих собой мебель.
 *
 * @author Valeriy Burlakov
 * @version 1.0
 */
public class Furniture extends AbstractProduct {
    /**
     * Хранит показатели ширины, длинны и высоты товара.
     */
    private Parameter parameter;
    /**
     * Показатель веса товара.
     */
    private float weight;

    /**
     * @param name      Название товара.
     * @param price     Цена товара.
     * @param quantity  Количество товара.
     * @param parameter Параметры товара.
     * @param weight    Вес единицы товара
     */
    public Furniture(String name, float price, int quantity, Parameter parameter, float weight) {
        super(name, price, quantity);
        this.parameter = parameter;
        if (weight > 0) {
            this.weight = weight;
        } else {
            throw new ProductIllegalArgumentException("Вес продукта не может быть отрицательным или равным нулю");
        }
    }

    public Parameter getParameter() {
        return parameter;
    }

    public void setParameter(Parameter parameter) {
        this.parameter = parameter;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            throw new ProductIllegalArgumentException("Вес продукта не может быть отрицательным или равным нулю");
        }
    }

}
