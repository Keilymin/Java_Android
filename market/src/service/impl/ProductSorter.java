package service.impl;

import model.impl.AbstractProduct;

import java.util.Arrays;

/**
 * Класс реализующий сортирувку товаров магазина.
 *
 * @author Valeriy Burlakov
 * @version 1.0
 */
public class ProductSorter {
    /**
     * Метод сортирующий товары в массиве по имени в алфавитном порядке, при этом null элементы будут в конце массива.
     *
     * @param abstractProducts Массив товаров.
     */
    static public void sortByName(AbstractProduct[] abstractProducts) {
        ProductComparator comparator = new ProductComparator();
        Arrays.sort(abstractProducts, comparator);
    }
}
