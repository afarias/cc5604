package cl.uchile.dcc.cc5604.proyectos.priceComparator;

import cl.uchile.dcc.cc5604.proyectos.priceComparator.domain.OfferedProduct;
import cl.uchile.dcc.cc5604.proyectos.priceComparator.domain.Provider;
import cl.uchile.dcc.cc5604.proyectos.priceComparator.domain.User;

/**
 * This class is responsible for define the services that will allow product providers, such as normal users or
 * companies to promote its products publishing or removing product offers.
 */
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
     */
    public void createOffer(Provider provider, OfferedProduct offeredProduct);

    /**
     * Allows a provider to remove an already existent offer.
     *
     * @param provider       The provider making the offer.
     * @param offeredProduct The product to be offered.
     */
    public void removeOffer(Provider provider, OfferedProduct offeredProduct);
}
