package model.impl;

import model.Parameter;

public class Furniture extends AbstractProduct {
    private Parameter parameter;
    private float weigth;

    public Furniture(String name, float price, int quantity, Parameter parameter, float weigth) {
        super(name, price, quantity);
        this.parameter = parameter;
        this.weigth = weigth;
    }

    public Parameter getParameter() {
        return parameter;
    }

    public void setParameter(Parameter parameter) {
        this.parameter = parameter;
    }

    public float getWeigth() {
        return weigth;
    }

    public void setWeigth(float weigth) {
        this.weigth = weigth;
    }

}
