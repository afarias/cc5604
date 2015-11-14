package cl.uchile.dcc.cc5604.proyectos.priceComparator.domain;

import cl.uchile.dcc.cc5604.proyectos.priceComparator.ListsManagerLocal;
import cl.uchile.dcc.cc5604.proyectos.priceComparator.ListsManagerRemote;

import javax.ejb.Stateful;

@Stateful(name="ProductList")
public class ListsManager implements ListsManagerRemote, ListsManagerLocal {
    public ListsManager() {
    }
}
