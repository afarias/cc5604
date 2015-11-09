package cl.uchile.dcc.cc5604.examples.titanCruiser.domain;

import javax.ejb.Local;

@Local
public interface TravelAgencyLocal {
    Reservation bookPassage();

    void checkIn(Reservation reservation);
}
