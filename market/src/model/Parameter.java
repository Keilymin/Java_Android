package model;

/**
 * Класс для хранения параметров обьекта.
 *
 * @author Valeriy Burlakov
 * @version 1.0
 */
public class Parameter {
    /**
     * Параметр высоты.
     */
    private float height;
    /**
     * Параметр ширины.
     */
    private float weight;
    /**
     * Параметр длинны.
     */
    private float length;

    /**
     * Конструктор класса, принимает все переменные класса.
     *
     * @param height Высота.
     * @param weight Ширина.
     * @param length Длинна.
     */
    public Parameter(float height, float weight, float length) {
        this.height = height;
        this.weight = weight;
        this.length = length;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }
}
