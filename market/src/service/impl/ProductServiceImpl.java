package service.impl;

import model.impl.AbstractProduct;
import service.ProductService;

import java.util.ArrayList;

/**
 * Класс реализующий интерфейс сервиса товаров магазина.
 *
 * @author Valeriy Burlakov
 * @version 1.0
 */
public class ProductServiceImpl implements ProductService {

    /**
     * Конструктор класса
     */
    public ProductServiceImpl() {
    }

    /**
     * Реализует подсчет суммы цены товаров в массиве.
     *
     * @param productArrayList Массив товаров.
     * @return Общая сумма цены.
     */
    @Override
    public float calculateTotalAmount(ArrayList<AbstractProduct> productArrayList) {
        float sum = 0;
        for (AbstractProduct aProductArrayList : productArrayList) {
            sum += aProductArrayList.calculateTotalPrice();
        }
        return sum;
    }

    /**
     * Реализует поиск по названию товара.
     *
     * @param productArrayList Массив товаров.
     * @param name             Название товара.
     * @return Массив товаров с данным названием.
     */
    @Override
    public ArrayList<AbstractProduct> searchByName(ArrayList<AbstractProduct> productArrayList, String name) {
        ArrayList<AbstractProduct> list = new ArrayList<>();
        for (AbstractProduct aProductArrayList : productArrayList) {
            if (aProductArrayList.getName().contains(name)) {
                list.add(aProductArrayList);
            }
        }
        return list;
    }
}
