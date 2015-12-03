package cl.uchile.dcc.cc5604.proyectos.priceComparator;

import cl.uchile.dcc.cc5604.proyectos.priceComparator.domain.OfferedProduct;
import cl.uchile.dcc.cc5604.proyectos.priceComparator.domain.Product;
import cl.uchile.dcc.cc5604.proyectos.priceComparator.domain.Provider;
import cl.uchile.dcc.cc5604.proyectos.priceComparator.domain.User;
import cl.uchile.dcc.cc5604.proyectos.priceComparator.exceptions.ProductNotFoundException;
import cl.uchile.dcc.cc5604.proyectos.priceComparator.exceptions.ProviderNotFoundException;

import javax.ejb.Remote;
import java.util.List;

/**
 * This class is responsible for define the services that will allow product providers, such as normal users or
 * companies to promote its products publishing or removing product offers.
 */
@Remote
public interface ProviderManager {

    /**
     * Register a user as a new provider.
     *
     * @param user The user becoming a provider.
     *
     * @return The provider that has been created from the user.
     *
     * @see cl.uchile.dcc.cc5604.proyectos.priceComparator.domain.User
     */
    public Provider createProvider(User user);

    /**
     * Allows a provider to offer an already existing product.
     *
     * @param provider       The provider making the offer.
     * @param offeredProduct The product to be offered.
     *
     * @throws ProductNotFoundException If there is no such product.
     */
    public void createOffer(Provider provider, OfferedProduct offeredProduct) throws ProductNotFoundException, ProviderNotFoundException;

    /**
     * This method is responsible for retrieving the history of offers made by a given provider for a given product.
     *
     * @param provider The provider that has offered the product.
     * @param product  The product whose offers are retrieved for the specific provider.
     *
     * @return A list of offers offered for the product by the provider.
     */
    public List<OfferedProduct> getProductHistory(Provider provider, Product product);

    /**
     * This method is responsible for finding any offer made for a given product, by any provider.
     *
     * @param product The product whose offers are to be found.
     *
     * @return The list of offers found for the specified <code>product</code>.
     *
     * @throws ProductNotFoundException If there is no such product.
     */
    public List<OfferedProduct> searchOffers(Product product) throws ProductNotFoundException;

    /**
     * This method is responsible for finding any offer made for a given product, by any provider.
     *
     * @param provider The provider whose offered products are to be found.
     *
     * @return The list of offers found for the specified <code>product</code>.
     */
    public List<OfferedProduct> searchOffers(Provider provider);

    /**
     * Allows a provider to remove an already existent offer.
     *
     * @param provider       The provider making the offer.
     * @param offeredProduct The product to be offered.
     */
    public void removeOffer(Provider provider, OfferedProduct offeredProduct);

    /**
     * This method is responsible for removing all the offered products placed by a given <code>provider</code>.
     *
     * @param provider The provider whose offered products are to be deleted.
     */
    public void removeAllOffers(Provider provider);

    /**
     * This method is responsible for registering a provider for further use.
     *
     * @param provider The provider to be registered.
     */
    public void registerProvider(Provider provider);

}
