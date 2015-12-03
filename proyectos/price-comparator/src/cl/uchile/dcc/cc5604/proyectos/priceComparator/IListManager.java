package cl.uchile.dcc.cc5604.proyectos.priceComparator;

import cl.uchile.dcc.cc5604.proyectos.priceComparator.domain.OfferedProduct;
import cl.uchile.dcc.cc5604.proyectos.priceComparator.domain.Product;
import cl.uchile.dcc.cc5604.proyectos.priceComparator.exceptions.ListAlreadyExistsException;
import cl.uchile.dcc.cc5604.proyectos.priceComparator.exceptions.NoSuchListException;

public interface IListManager {

    /**
     * This method is responsible for creating a customer list of products or offers.
     *
     * @param listName The list name.
     *
     * @return Returns <code>true</code> if the list was created and <code>false</code> otherwise.
     *
     * @throws ListAlreadyExistsException Thrown if there is already a List with the same name.
     */
    public boolean createList(String listName) throws ListAlreadyExistsException;

    /**
     * This method is responsible for removing a customer list of products or offers.
     *
     * @param listName The list name to be removed.
     *
     * @return Returns <code>true</code> if the list has been removed or <code>false</code> otherwise.
     *
     * @throws NoSuchListException Thrown if there is no list to be removed with name <code>listName</code>.
     */
    public boolean removeList(String listName) throws NoSuchListException;

    /**
     * This method is responsible for adding a product to a given list.
     *
     * @param listName The list to which the product is to be added.
     * @param product  The product to add.
     *
     * @return Returns <code>true</code> if the product could be added and <code>false</code> otherwise.
     */
    public boolean addToList(String listName, Product product);
    /**
     * This method is responsible for adding an offered product to a given list.
     *
     * @param listName The list to which the product is to be added.
     * @param offeredProduct  The offered product to add.
     *
     * @return Returns <code>true</code> if the product could be added and <code>false</code> otherwise.
     */
    public boolean addToList(String listName, OfferedProduct offeredProduct);

    /**
     * This method is responsible for adding a product to a given list.
     *
     * @param listName The list to which the product is to be added.
     * @param product  The product to add.
     *
     * @return Returns <code>true</code> if the product could be added and <code>false</code> otherwise.
     */
    public boolean removeFromList(String listName, Product product);
    /**
     * This method is responsible for adding a product to a given list.
     *
     * @param listName The list to which the product is to be added.
     * @param offeredProduct  The offered product to be removed.
     *
     * @return Returns <code>true</code> if the product could be added and <code>false</code> otherwise.
     */
    public boolean removeFromList(String listName, OfferedProduct offeredProduct);
}
