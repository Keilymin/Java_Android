package service.impl;

import model.impl.Foodstaff;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class FoodstaffServiceImpl extends ProductServiceImpl {
    private boolean isExpirationDate(Foodstaff foodstaff) {
        return foodstaff.getExpirationDate().isAfter(LocalDateTime.now());

    }


    public int calculateTotalCalorieContent(ArrayList<Foodstaff> foodstaff) {
        int sum = 0;
        for (Foodstaff i : foodstaff) {
            sum += i.getCalorieContent()*i.getQuantity();
        }
        return sum;
    }
}
