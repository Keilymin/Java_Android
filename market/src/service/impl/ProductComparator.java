package service.impl;

import model.impl.AbstractProduct;

import java.util.Comparator;
/**
 * Класс реализующий интерфейс Comparator для товаров магазина.
 *
 * @author Valeriy Burlakov
 * @version 1.0
 */
public class ProductComparator implements Comparator<AbstractProduct> {
    @Override
    public int compare(AbstractProduct o1, AbstractProduct o2) {
        if (o1 == null) {
            return 1;
        } else if (o2 == null) {
            return -1;
        } else {
            return o1.getName().compareTo(o2.getName());
        }
    }
}
