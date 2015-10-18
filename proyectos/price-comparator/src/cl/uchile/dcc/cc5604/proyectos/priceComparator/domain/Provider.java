package cl.uchile.dcc.cc5604.proyectos.priceComparator.domain;

import javax.ejb.Remote;
import java.io.Serializable;

/**
 * This class is responsible for modeling a Provider.
 */
public class Provider implements Serializable {

    private String name;

    public Provider(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
