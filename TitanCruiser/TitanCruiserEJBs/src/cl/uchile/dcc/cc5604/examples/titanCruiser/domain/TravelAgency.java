package cl.uchile.dcc.cc5604.examples.titanCruiser.domain;

import javax.ejb.Remote;

@Remote
public interface TravelAgency {

    public Reservation bookPassage();

    void checkIn(Reservation reservation);
}
