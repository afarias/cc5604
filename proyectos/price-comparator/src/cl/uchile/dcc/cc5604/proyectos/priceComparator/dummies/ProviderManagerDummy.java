package cl.uchile.dcc.cc5604.proyectos.priceComparator.dummies;

import cl.uchile.dcc.cc5604.proyectos.priceComparator.ProviderManager;
import cl.uchile.dcc.cc5604.proyectos.priceComparator.domain.*;
import cl.uchile.dcc.cc5604.proyectos.priceComparator.exceptions.ProductNotFoundException;

import javax.ejb.Singleton;
import java.nio.file.ProviderNotFoundException;
import java.util.*;

/**
 * This is a dummy implementation.
 */
@Singleton
public class ProviderManagerDummy implements ProviderManager {

    /* A temporary list of providers */
    private List<Provider> providers = new ArrayList<Provider>();

    private Map<Provider, List<OfferedProduct>> offeredProducts = new HashMap<Provider, List<OfferedProduct>>();

    @Override
    public Provider createProvider(User user) {
        /* The provider is created */
        ProviderUserBased providerUserBased = new ProviderUserBased(user);

        /* Added to the list of providers */
        providers.add(providerUserBased);

        /* And returned */
        return providerUserBased;
    }

    @Override
    public void createOffer(Provider provider, OfferedProduct offeredProduct) throws ProductNotFoundException, ProviderNotFoundException {

        /* Check if there is such provider */
        if (!providers.contains(provider)) {
            throw new ProviderNotFoundException("Provider " + provider.getName() + " does not exists.");
        }

        /* If there are no products for this providers, it is added to the map */
        if (!offeredProducts.containsKey(provider)) {
            offeredProducts.put(provider, new ArrayList<OfferedProduct>());
        }

        offeredProducts.get(provider).add(offeredProduct);
    }

    @Override
    public void publishOffer(Provider provider, OfferedProduct offeredProduct) throws ProductNotFoundException {

        /* Check if there is such provider */
        if (!providers.contains(provider)) {
            throw new ProviderNotFoundException("Provider " + provider.getName() + " does not exists.");
        }

        /* If there are no products for this providers, it is added to the map */
        if (!offeredProducts.containsKey(provider)) {
            offeredProducts.put(provider, new ArrayList<OfferedProduct>());
        }

        offeredProducts.get(provider).add(offeredProduct);
    }

    @Override
    public List<OfferedProduct> searchOffers(Product product) throws ProductNotFoundException {
        Collection<List<OfferedProduct>> offeredProductsOfAllProviders = offeredProducts.values();
        List<OfferedProduct> allOfferedProducts= new ArrayList<OfferedProduct>();

        for (List<OfferedProduct> offeredProductsOfAllProvider : offeredProductsOfAllProviders) {
            allOfferedProducts.addAll(offeredProductsOfAllProvider);
        }

        return allOfferedProducts;
    }

    @Override
    public void removeOffer(Provider provider, OfferedProduct offeredProduct) {
        if(!providers.contains(provider)){
            return;
        }

        offeredProducts.remove(provider);
        providers.remove(provider);
    }
}
