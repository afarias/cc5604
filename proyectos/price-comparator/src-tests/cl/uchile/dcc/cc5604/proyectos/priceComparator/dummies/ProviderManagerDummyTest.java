package cl.uchile.dcc.cc5604.proyectos.priceComparator.dummies;

import cl.uchile.dcc.cc5604.proyectos.priceComparator.domain.OfferedProduct;
import cl.uchile.dcc.cc5604.proyectos.priceComparator.domain.Product;
import cl.uchile.dcc.cc5604.proyectos.priceComparator.domain.Provider;
import cl.uchile.dcc.cc5604.proyectos.priceComparator.exceptions.ProductNotFoundException;
import cl.uchile.dcc.cc5604.proyectos.priceComparator.exceptions.ProviderNotFoundException;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ProviderManagerDummyTest {

    @Test
    public void testCreateProvider() throws Exception {

    }

    @Test
    public void testCreateOffer() throws Exception {

    }

    @Test
    public void testPublishOffer() throws Exception {

    }

    @Test
    public void testSearchOffers() throws Exception {

    }

    @Test
    public void testRemoveOffer() throws Exception {

    }

    @Test(expected = ProductNotFoundException.class)
    public void testRemoveAllOffers() throws Exception {

        ProviderManagerDummy providerManagerDummy = new ProviderManagerDummy();

        /* The provider and its offers are initialized */
        Provider falabella = initializeFalabella(providerManagerDummy);

        /* Its offers are removed */
        providerManagerDummy.removeAllOffers(falabella);

        List<OfferedProduct> offeredProducts = providerManagerDummy.searchOffers(falabella);
        Assert.assertEquals(0, offeredProducts.size());
    }

    private Provider initializeFalabella(ProviderManagerDummy providerManagerDummy) throws ProductNotFoundException, ProviderNotFoundException {
        Provider falabella = new Provider("Falabella");

        Product playStation4 = new Product("PlayStation 4");
        Product xBox = new Product("PlayStation 4");

        OfferedProduct play4Offer = new OfferedProduct(playStation4, 300000);
        OfferedProduct xBoxOffer = new OfferedProduct(xBox, 250000);

        providerManagerDummy.registerProvider(falabella);
        providerManagerDummy.createOffer(falabella, play4Offer);
        providerManagerDummy.createOffer(falabella, xBoxOffer);

        return falabella;
    }
}