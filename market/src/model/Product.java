package model;

/**
 * интерфейс для реализации класса товаров магазина.
 *
 * @author Valeriy Burlakov
 * @version 1.0
 */
public interface Product {
    /**
     * Должен реализовывать подсчет общей цены товаров.
     *
     * @return Общая цена этого товара в наличии.
     */
    float calculateTotalPrice();
}
