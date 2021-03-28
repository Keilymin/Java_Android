package service.impl;

import model.impl.AbstractProduct;

import java.util.Arrays;

public class ProductSorter {

    static public void sortByName(AbstractProduct[] abstractProducts) {
        ProductComparator comparator = new ProductComparator();
        Arrays.sort(abstractProducts, comparator);
    }
}
