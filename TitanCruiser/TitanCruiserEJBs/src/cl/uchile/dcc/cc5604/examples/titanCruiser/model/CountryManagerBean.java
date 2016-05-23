package cl.uchile.dcc.cc5604.examples.titanCruiser.model;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.Collection;
import java.util.List;

@Stateless(name = "CountryManager")
public class CountryManagerBean implements CountryManagerLocal {

    @PersistenceContext(unitName = "titanPU")
    private EntityManager em;

    public List<Country> getAllCountries(){
        Query query = em.createQuery("SELECT c FROM Country c");
        return (List<Country>) query.getResultList();
    }
}
