package cl.uchile.dcc.cc5604.proyectos.priceComparator;

import cl.uchile.dcc.cc5604.proyectos.priceComparator.domain.OfferedProduct;
import cl.uchile.dcc.cc5604.proyectos.priceComparator.domain.ReservationVoucher;

import javax.ejb.Remote;

/**
 * This class aims to provide the ability to perform transactions.
 */
@Remote
public interface TransactionManager {

    public ReservationVoucher reserve(OfferedProduct offeredProduct, int quantity);
}
