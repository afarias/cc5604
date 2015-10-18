package cl.uchile.dcc.cc5604.proyectos.priceComparator;

import cl.uchile.dcc.cc5604.proyectos.priceComparator.domain.Product;
import cl.uchile.dcc.cc5604.proyectos.priceComparator.domain.Provider;
import cl.uchile.dcc.cc5604.proyectos.priceComparator.exceptions.ProductAlreadyExistException;

import javax.ejb.Remote;
import java.util.List;

/**
 * This class is responsible for providing services for products.
 */
@Remote
public interface ProductManager {

    /**
     * This method is responsible for creating a new product on the general catalog.
     *
     * @param product The product to be created.
     *
     * @throws ProductAlreadyExistException Thrown if the Product to be created already exists.
     */
    public void createProduct(Product product) throws ProductAlreadyExistException;

    /**
     * This method is responsible for removing a product from the general catalog. There are some business rules that
     * will be verified before.
     * <p />
     * <ul>
     * <li>There should be no provider offering the product.</li>
     * <li>There is no offer for the product.</li>
     * <li>There is no transaction made ever for the product.</li>
     * </ul>
     *
     * @param product The product to be removed.
     */
    public void deleteProduct(Product product);

    /**
     * This method is responsible for retrieving the full list of products on the general catalog.
     *
     * @return A <code>List</code> of products.
     */
    public List<Product> getProducts();

    /**
     * This method is responsible for retrieving the full list of products on the general catalog that are offered by a
     * given provider.
     *
     * @param provider The provider whose products are to be retrieved and returned.
     *
     * @return A <code>List</code> of products offered by a given <code>provider</code>.
     */
    public List<Product> getProductsFrom(Provider provider);

}
