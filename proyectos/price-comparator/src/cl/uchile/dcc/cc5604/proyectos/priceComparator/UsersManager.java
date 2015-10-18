package cl.uchile.dcc.cc5604.proyectos.priceComparator;

import cl.uchile.dcc.cc5604.proyectos.priceComparator.domain.Product;
import cl.uchile.dcc.cc5604.proyectos.priceComparator.domain.User;
import cl.uchile.dcc.cc5604.proyectos.priceComparator.exceptions.ProductNotFoundException;
import cl.uchile.dcc.cc5604.proyectos.priceComparator.exceptions.UserAlreadyExistsException;
import cl.uchile.dcc.cc5604.proyectos.priceComparator.exceptions.UserNotFoundException;

import javax.ejb.Remote;
import java.util.List;

/**
 * This class is responsible for defining the basic needs for user management.
 */
@Remote
public interface UsersManager {

    /**
     * This method is responsible for handling the (persistent) creation of new users.
     *
     * @param user The user to be created.
     *
     * @throws UserAlreadyExistsException Thrown whenever the user to be created already exists.
     */
    public void create(User user) throws UserAlreadyExistsException;

    /**
     * This method is responsible for adding a product to a (default by now) list of a user.
     *
     * @param product The product to be added.
     * @param user    The user for whom the product it's added to its list.
     *
     * @throws ProductNotFoundException Thrown if there is no such product.
     */
    public void addProductToList(Product product, User user) throws ProductNotFoundException, UserNotFoundException;

    /**
     * This method is responsible for removing a product from a (default by now) list of a user.
     * If the product is not found on the user's list, nothing is performed, but no exception is thrown (for the
     * product
     * is not in the list, as it was bid).
     *
     * @param product The product to be removed from the list.
     * @param user    The user for whom the product it's removed from its list.
     *
     * @throws ProductNotFoundException Thrown if there is no such product.
     */
    public void removedProductToList(Product product, User user) throws ProductNotFoundException, UserNotFoundException;

    /**
     * This method is responsible for removing a product from a (default by now) list of a user.
     * If the product is not found on the user's list, nothing is performed, but no exception is thrown (for the
     * product
     * is not in the list, as it was bid).
     *
     * @param user The user for whom the product it's removed from its list.
     *
     * @return A list with the products on the default user's list.
     *
     * @throws UserNotFoundException Thrown if there is no such product.
     */
    public List<Product> listProductsOnList(User user) throws UserNotFoundException;
}
