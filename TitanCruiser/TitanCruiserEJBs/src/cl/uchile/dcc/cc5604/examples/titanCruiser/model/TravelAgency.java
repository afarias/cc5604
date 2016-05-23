package cl.uchile.dcc.cc5604.examples.titanCruiser.model;

import javax.ejb.Remote;

@Remote
public interface TravelAgency {

    /**
     * This method is responsible for booking a passage, resulting in a new fresh reservation.
     *
     * @return A reservation.
     */
    public Reservation bookPassage();

    void checkIn(Reservation reservation);
}
