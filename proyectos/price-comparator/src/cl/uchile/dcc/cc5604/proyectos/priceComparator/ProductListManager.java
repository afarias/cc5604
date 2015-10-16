package cl.uchile.dcc.cc5604.proyectos.priceComparator;

import cl.uchile.dcc.cc5604.proyectos.priceComparator.domain.Product;
import cl.uchile.dcc.cc5604.proyectos.priceComparator.domain.User;

import java.util.List;

/**
 * Created by andres on 10/15/15.
 */
public interface ProductListManager {

    List<Product> getProducts(User user);

    void addProduct(User user, Product product);

    void removeProduct(User user, Product product);

}
