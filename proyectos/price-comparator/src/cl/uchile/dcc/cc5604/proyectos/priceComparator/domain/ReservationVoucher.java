package cl.uchile.dcc.cc5604.proyectos.priceComparator.domain;

import java.util.Calendar;

/**
 * Created by andres on 11/29/15.
 */
public class ReservationVoucher {

    /** The date when the reservation was made */
    private Calendar reservationDate;

    /** The product reserved (which includes the provider) */
    private OfferedProduct offeredProduct;

    private int quantity;
}
