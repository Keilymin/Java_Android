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
        if (height > 0 && weight > 0 && length > 0) {
            this.height = height;
            this.weight = weight;
            this.length = length;
        } else {
            throw new IllegalArgumentException("Аргументы не могут быть отрицательными или равными нулю");
        }
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        if (height > 0) {
            this.height = height;
        } else {
            throw new IllegalArgumentException("Высота не может быть отрицательной или равной нулю");
        }
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            throw new IllegalArgumentException("Ширина не может быть отрицательной или равной нулю");
        }
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        if (length > 0) {
            this.length = length;
        } else {
            throw new IllegalArgumentException("Длинна не может быть отрицательной или равной нулю");
        }
    }
}
