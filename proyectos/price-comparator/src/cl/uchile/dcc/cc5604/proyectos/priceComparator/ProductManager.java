package cl.uchile.dcc.cc5604.proyectos.priceComparator;

import cl.uchile.dcc.cc5604.proyectos.priceComparator.domain.Product;
import cl.uchile.dcc.cc5604.proyectos.priceComparator.domain.Provider;

import java.util.List;

/**
 * Created by andres on 10/15/15.
 */
public interface ProductManager {

    public void createProduct(Product product);
    public void deleteProduct(Product product);
    public List<Product> getProducts();
    public List<Product> getProductsFrom(Provider provider);

}
