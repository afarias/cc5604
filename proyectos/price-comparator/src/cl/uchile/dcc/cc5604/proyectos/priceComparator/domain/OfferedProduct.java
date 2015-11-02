package cl.uchile.dcc.cc5604.proyectos.priceComparator.domain;

import java.io.Serializable;

/**
 * This class is responsible for representing a product offer.
 */
public class OfferedProduct implements Serializable {

    private Product product;
    private double offeredValue;

    public OfferedProduct(Product product, double offeredValue) {
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
}
