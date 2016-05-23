package cl.uchile.dcc.cc5604.examples.titanCruiser.model;

import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Remote({TravelAgency.class})
@Local({TravelAgencyLocal.class})
@Stateful
public class TravelAgentBean implements TravelAgency, TravelAgencyLocal {

    /** An Entity Manager */
    @PersistenceContext(name = "TitanPU")
    private EntityManager em;

    public TravelAgentBean() {
    }

    public Reservation bookPassage() {
        return null;
    }

    public void checkIn(Reservation reservation){

    }

    @Override
    public Cabin findCabin() {
        return null;
    }
}
