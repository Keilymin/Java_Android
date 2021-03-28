package service.impl;

import model.impl.AbstractProduct;

public class ProductFilter {
    static public void filterName(AbstractProduct[] abstractProducts, String name) {

        for (int i = 0; i < abstractProducts.length; i++) {
            if (abstractProducts[i] != null) {
                if (!abstractProducts[i].getName().equals(name)) {
                    abstractProducts[i] = null;
                }
            }
        }
    }
}
