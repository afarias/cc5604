package cl.uchile.dcc.cc5604.proyectos.priceComparator.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * This class is responsible for representing a User.
 */
public class User implements Serializable {

    private String name;
    private List<Product> wishList;

    public User(String name) {
        this.name = name;
        this.wishList = new ArrayList<Product>();
    }

    public String getName() {
        return name;
    }

    public List<Product> getWishList() {
        return wishList;
    }
}
