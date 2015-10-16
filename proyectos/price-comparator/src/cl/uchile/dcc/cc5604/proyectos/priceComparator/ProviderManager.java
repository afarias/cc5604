package cl.uchile.dcc.cc5604.proyectos.priceComparator;

import cl.uchile.dcc.cc5604.proyectos.priceComparator.domain.OfferedProduct;
import cl.uchile.dcc.cc5604.proyectos.priceComparator.domain.Provider;
import cl.uchile.dcc.cc5604.proyectos.priceComparator.domain.User;

public interface ProviderManager {

    public Provider createProvider(User user);
    public void createOffer(Provider user, OfferedProduct offeredProduct);
    public void removeOffer(Provider user, OfferedProduct offeredProduct);
}
