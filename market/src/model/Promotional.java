package model;

/**
 * интерфейс для реализации скидочных товаров.
 *
 * @author Valeriy Burlakov
 * @version 1.0
 */
public interface Promotional {
    /**
     * Метод должен реализовывать уменьшение цены товара.
     *
     * @param percent Значение процента скидки, где 1.0 это 100%
     */
    void makeSale(float percent);
}
