package cl.uchile.dcc.cc5604.proyectos.priceComparator;

import javax.ejb.Remote;

@Remote
public interface SystemManager {

    public void setMaxUsers(int numberOfUsers);

    public int getMaxUsers();

}
