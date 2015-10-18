package cl.uchile.dcc.cc5604.proyectos.priceComparator;

import cl.uchile.dcc.cc5604.proyectos.priceComparator.domain.OfferedProduct;
import cl.uchile.dcc.cc5604.proyectos.priceComparator.domain.Product;
import cl.uchile.dcc.cc5604.proyectos.priceComparator.domain.Provider;
import cl.uchile.dcc.cc5604.proyectos.priceComparator.domain.User;
import cl.uchile.dcc.cc5604.proyectos.priceComparator.exceptions.ProductNotFoundException;

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
    public void createOffer(Provider provider, OfferedProduct offeredProduct) throws ProductNotFoundException;

    public void publishOffer(Provider provider, OfferedProduct offeredProduct) throws ProductNotFoundException;

    /**
     * This method is responsible for finding any offer made for a given product, by any provider.
     *
     * @return The list of offers found for the specified <code>product</code>.
     *
     * @throws ProductNotFoundException If there is no such product.
     */
    public List<OfferedProduct> searchOffers(Product product) throws ProductNotFoundException;

    /**
     * Allows a provider to remove an already existent offer.
     *
     * @param provider       The provider making the offer.
     * @param offeredProduct The product to be offered.
     */
    public void removeOffer(Provider provider, OfferedProduct offeredProduct);
}
