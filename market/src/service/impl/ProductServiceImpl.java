package service.impl;

import model.impl.AbstractProduct;
import service.ProductService;

import java.util.ArrayList;

public class ProductServiceImpl implements ProductService {

    public ProductServiceImpl() {
    }

    @Override
    public float calculateTotalAmount(ArrayList<AbstractProduct> productArrayList) {
        float sum = 0;
        for (AbstractProduct aProductArrayList : productArrayList) {
            sum += aProductArrayList.calculateTotalPrice();
        }
        return sum;
    }

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
