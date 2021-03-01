package service;

import model.Product;
import model.impl.AbstractProduct;

import java.util.ArrayList;

public interface ProductService {
    float calculateTotalAmount(ArrayList<AbstractProduct> productArrayList);

    ArrayList<AbstractProduct> searchByName(ArrayList<AbstractProduct> productArrayList, String name);
}
