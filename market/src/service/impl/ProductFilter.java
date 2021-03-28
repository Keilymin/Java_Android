package service.impl;

import model.impl.AbstractProduct;

/**
 * Класс реализующий фильтрацию товаров магазина.
 *
 * @author Valeriy Burlakov
 * @version 1.0
 */
public class ProductFilter {
    /**
     * Метод фильтрует массив товаров по названию товара, заменяя все что не совпадает с переданной переменной на null.
     *
     * @param abstractProducts Массив товаров.
     * @param name             Название по которому идет фильтрация.
     */
    static public void filterByName(AbstractProduct[] abstractProducts, String name) {

        for (int i = 0; i < abstractProducts.length; i++) {
            if (abstractProducts[i] != null) {
                if (!abstractProducts[i].getName().equals(name)) {
                    abstractProducts[i] = null;
                }
            }
        }
    }
}
