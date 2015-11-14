package cl.uchile.dcc.cc5604.proyectos.priceComparator.dummies;

import cl.uchile.dcc.cc5604.proyectos.priceComparator.ProductManager;
import cl.uchile.dcc.cc5604.proyectos.priceComparator.domain.Product;
import cl.uchile.dcc.cc5604.proyectos.priceComparator.domain.Provider;
import cl.uchile.dcc.cc5604.proyectos.priceComparator.exceptions.ProductAlreadyExistException;
import com.sun.istack.internal.NotNull;

import javax.ejb.Stateful;
import java.util.ArrayList;
import java.util.List;

/**
 * A dummy implementation for this class.
 */
@Stateful
public class ProductManagerDummy implements ProductManager {

    /** This dummy product catalog */
    private List<Product> catalog;

    public ProductManagerDummy() {
        this.catalog = new ArrayList<Product>();
    }

    @Override
    public void createProduct(Product product) throws ProductAlreadyExistException {

        /* Basic check, thanks the product implements equals */
        if (this.catalog.contains(product)) {
            throw new ProductAlreadyExistException();
        }

        this.catalog.add(product);
    }

    @Override
    public void deleteProduct(Product product) {
        this.catalog.remove(product);
    }

    @Override
    public List<Product> getProducts() {
        return this.catalog;
    }

    @Override
    public List<Product> getProductsFrom(Provider provider) {
        return this.catalog;
    }

    @Override
    public List<Product> findProductsByName(@NotNull String productName) {

        List<Product> resultList = new ArrayList<Product>();

        for (Product product : catalog) {
            if (product.getName().contains(productName)) {
                resultList.add(product);
            }
        }

        return resultList;
    }
}
