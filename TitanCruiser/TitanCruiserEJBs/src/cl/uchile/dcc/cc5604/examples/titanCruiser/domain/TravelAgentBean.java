package cl.uchile.dcc.cc5604.examples.titanCruiser.domain;

import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateful;

@Remote({TravelAgency.class})
@Local({TravelAgencyLocal.class})
@Stateful
public class TravelAgentBean implements TravelAgency, TravelAgencyLocal {

    public TravelAgentBean() {
    }

    public Reservation bookPassage() {
        return null;
    }

    public void checkIn(Reservation reservation){

    }
}
