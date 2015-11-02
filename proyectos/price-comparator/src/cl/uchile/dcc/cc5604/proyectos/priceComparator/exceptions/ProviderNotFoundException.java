package cl.uchile.dcc.cc5604.proyectos.priceComparator.exceptions;

import cl.uchile.dcc.cc5604.proyectos.priceComparator.domain.Provider;

/**
 * Created by andres on 11/2/15.
 */
public class ProviderNotFoundException extends Exception{
    private Provider provider;

    public ProviderNotFoundException(String message) {
        super(message);
    }

    public ProviderNotFoundException(Provider provider) {
        this.provider = provider;
    }

    public Provider getProvider() {
        return provider;
    }
}
