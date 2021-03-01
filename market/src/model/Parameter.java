package model;

public class Parameter {
    private float heigth;
    private float weigth;
    private float length;

    public Parameter(float heigth, float weigth, float length) {
        this.heigth = heigth;
        this.weigth = weigth;
        this.length = length;
    }

    public float getHeigth() {
        return heigth;
    }

    public void setHeigth(float heigth) {
        this.heigth = heigth;
    }

    public float getWeigth() {
        return weigth;
    }

    public void setWeigth(float weigth) {
        this.weigth = weigth;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }
}
