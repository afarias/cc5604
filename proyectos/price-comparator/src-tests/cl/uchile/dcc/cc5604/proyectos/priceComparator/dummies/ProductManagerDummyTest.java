package cl.uchile.dcc.cc5604.proyectos.priceComparator.dummies;

import cl.uchile.dcc.cc5604.proyectos.priceComparator.domain.Product;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ProductManagerDummyTest {

    @Test
    public void testFindProductsByName() throws Exception {
        ProductManagerDummy productManagerDummy = new ProductManagerDummy();

        /* A product is created */
        String ps4Name = "PlayStation 4";
        Product ps4 = new Product(ps4Name);
        productManagerDummy.createProduct(ps4);

        /* Exact name look up */
        List<Product> productsByName = productManagerDummy.findProductsByName(ps4Name);

        /* Expected results */
        Assert.assertEquals(1, productsByName.size());
        Assert.assertEquals(ps4, productsByName.get(0));
    }

    @Test
    public void testFindProductsByName02() throws Exception {
        ProductManagerDummy productManagerDummy = new ProductManagerDummy();

        /* A product is created */
        Product ps4 = new Product("PlayStation 4");
        productManagerDummy.createProduct(ps4);

        /* Matching with the beginning */
        List<Product> productsByName = productManagerDummy.findProductsByName("Play");

        /* Expected results */
        Assert.assertEquals(1, productsByName.size());
        Assert.assertEquals(ps4, productsByName.get(0));
    }

    @Test
    public void testFindProductsByName03() throws Exception {
        ProductManagerDummy productManagerDummy = new ProductManagerDummy();

        /* A product is created */
        Product ps4 = new Product("PlayStation 4");
        productManagerDummy.createProduct(ps4);

        /* Matching with the beginning */
        List<Product> productsByName = productManagerDummy.findProductsByName("Station");

        /* Expected results */
        Assert.assertEquals(1, productsByName.size());
        Assert.assertEquals(ps4, productsByName.get(0));
    }
}