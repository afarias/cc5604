package cl.uchile.dcc.cc5604.examples.titanCruiser.model;

import javax.ejb.Local;

@Local
public interface TravelAgencyLocal {

    Reservation bookPassage();

    void checkIn(Reservation reservation);

    public Cabin findCabin();
}
