package cl.uchile.dcc.cc5604.proyectos.priceComparator.dummies;

import cl.uchile.dcc.cc5604.proyectos.priceComparator.ProviderManager;
import cl.uchile.dcc.cc5604.proyectos.priceComparator.domain.*;
import cl.uchile.dcc.cc5604.proyectos.priceComparator.exceptions.ProductNotFoundException;
import cl.uchile.dcc.cc5604.proyectos.priceComparator.exceptions.ProviderNotFoundException;
import com.sun.istack.internal.NotNull;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import java.util.*;

/**
 * This is a dummy implementation.
 */
@Singleton
public class ProviderManagerDummy implements ProviderManager {

    /* A temporary list of providers */
    private List<Provider> providers = new ArrayList<Provider>();

    private Map<Provider, List<OfferedProduct>> offeredProducts = new HashMap<Provider, List<OfferedProduct>>();

    @PostConstruct
    private void init() {
        providers = new ArrayList<Provider>();
        offeredProducts = new HashMap<Provider, List<OfferedProduct>>();
    }


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
    public void publishOffer(Provider provider, OfferedProduct offeredProduct) throws ProductNotFoundException, ProviderNotFoundException {

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

        /* All offered products are retrieved */
        Collection<List<OfferedProduct>> offeredProductsOfAllProviders = offeredProducts.values();
        List<OfferedProduct> allOfferedProducts = new ArrayList<OfferedProduct>();

        for (List<OfferedProduct> offeredProductsOfAllProvider : offeredProductsOfAllProviders) {
            for (OfferedProduct offeredProduct : offeredProductsOfAllProvider) {
                if (offeredProduct.getProduct().equals(product)) {
                    allOfferedProducts.add(offeredProduct);
                }
            }
        }

        return allOfferedProducts;
    }

    @Override
    public List<OfferedProduct> searchOffers(@NotNull Provider provider) {

        if (!offeredProducts.containsKey(provider)) {
            return new ArrayList<OfferedProduct>();
        }

        return this.offeredProducts.get(provider);
    }

    @Override
    public void removeOffer(Provider provider, OfferedProduct offeredProduct) {

        /*
         * The existence of the provider is validated first. If the provider does not exists, nothing is done (all its
         * products are no there any more (they never were either)!) so no exception is thrown
         */
        if (!providers.contains(provider)) {
            return;
        }

        /* The list of products offered by this provider is retrieved */
        List<OfferedProduct> providerProducts = offeredProducts.get(provider);
        boolean removed = providerProducts.remove(offeredProduct);

        if (removed) {
            System.out.println("The product " + offeredProduct + " was removed from the offered products.");
        } else {
            System.out.println("The product " + offeredProduct + " was not found among the offered products.");
        }
    }

    @Override
    public void removeAllOffers(Provider provider) {

        if (!providers.contains(provider)) {
            return;
        }

        /* The provider's offers are removed */
        offeredProducts.remove(provider);
    }

    @Override
    public void registerProvider(Provider provider) {
        providers.add(provider);
    }
}
