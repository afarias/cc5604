package cl.uchile.dcc.cc5604.proyectos.priceComparator.domain;

import java.io.Serializable;

/**
 * This class is responsible for modeling a product.
 */
public class Product implements Serializable{

    /** The product's name */
    private String name;

    public Product(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (name != null ? !name.equals(product.name) : product.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
