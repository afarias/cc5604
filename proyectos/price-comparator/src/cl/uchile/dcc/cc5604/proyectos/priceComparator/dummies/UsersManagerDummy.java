package cl.uchile.dcc.cc5604.proyectos.priceComparator.dummies;

import cl.uchile.dcc.cc5604.proyectos.priceComparator.UsersManager;
import cl.uchile.dcc.cc5604.proyectos.priceComparator.domain.Product;
import cl.uchile.dcc.cc5604.proyectos.priceComparator.domain.User;
import cl.uchile.dcc.cc5604.proyectos.priceComparator.exceptions.ProductNotFoundException;
import cl.uchile.dcc.cc5604.proyectos.priceComparator.exceptions.UserAlreadyExistsException;
import cl.uchile.dcc.cc5604.proyectos.priceComparator.exceptions.UserNotFoundException;

import java.util.List;

/**
 * Created by andres on 10/18/15.
 */
public class UsersManagerDummy implements UsersManager {

    private List<User> users;

    @Override
    public void create(User user) throws UserAlreadyExistsException {
        users.add(user);
    }

    @Override
    public void addProductToList(Product product, User user) throws UserNotFoundException, ProductNotFoundException {
        if (!users.contains(user)){
            throw new UserNotFoundException(user.getName());
        }

        users.get(users.indexOf(user)).getWishList().add(product);
    }

    @Override
    public void removedProductToList(Product product, User user) throws ProductNotFoundException, UserNotFoundException {
        if (!users.contains(user)){
            throw new UserNotFoundException(user.getName());
        }

        users.get(users.indexOf(user)).getWishList().remove(product);
    }

    @Override
    public List<Product> listProductsOnList(User user) throws UserNotFoundException {
        if (!users.contains(user)){
            throw new UserNotFoundException(user.getName());
        }

        return users.get(users.indexOf(user)).getWishList();
    }
}
