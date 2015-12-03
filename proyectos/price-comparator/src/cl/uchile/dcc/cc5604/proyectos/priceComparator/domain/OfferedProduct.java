package cl.uchile.dcc.cc5604.proyectos.priceComparator.domain;

import java.io.Serializable;
import java.util.Calendar;

/**
 * This class is responsible for representing a product offer.
 */
public class OfferedProduct implements Serializable {

    /** The offered product */
    private Product product;

    /** The value at which the product is offered */
    private double offeredValue;

    /** The stock of the offered product at the given value */
    private int stock;

    /** The date until which the product is offered */
    private Calendar expirationDate;

    /** The provider that offers the product */
    private Provider provider;

    public OfferedProduct(Provider provider, Product product, double offeredValue) {
        this.provider = provider;
        this.product = product;
        this.offeredValue = offeredValue;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getOfferedValue() {
        return offeredValue;
    }

    public void setOfferedValue(double offeredValue) {
        this.offeredValue = offeredValue;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Calendar getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Calendar expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }
}
