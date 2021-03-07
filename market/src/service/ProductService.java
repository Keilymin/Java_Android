package service;


import model.impl.AbstractProduct;

import java.util.ArrayList;

/**
 * интерфес для сервиса товаров магазина.
 *
 * @author Valeriy Burlakov
 * @version 1.0
 */
public interface ProductService {
    /**
     * Должен реализовывать подсчет цены всех товаров в массиве.
     *
     * @param productArrayList Массив товаров.
     * @return Общая цена товаров в массиве.
     */
    float calculateTotalAmount(ArrayList<AbstractProduct> productArrayList);

    /**
     * Должен реализовывать поиск в массиве товаров по названию.
     *
     * @param productArrayList Массив товаров.
     * @param name             Название товара.
     * @return Массив товаров с данным названием.
     */
    ArrayList<AbstractProduct> searchByName(ArrayList<AbstractProduct> productArrayList, String name);
}
