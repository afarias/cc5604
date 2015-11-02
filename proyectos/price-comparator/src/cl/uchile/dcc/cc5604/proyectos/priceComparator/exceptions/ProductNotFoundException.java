package cl.uchile.dcc.cc5604.proyectos.priceComparator.exceptions;

import cl.uchile.dcc.cc5604.proyectos.priceComparator.domain.Product;

/**
 * This class collects the information about an search user that was not found.
 */
public class ProductNotFoundException extends Exception {

    private Product product;

    public ProductNotFoundException(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
