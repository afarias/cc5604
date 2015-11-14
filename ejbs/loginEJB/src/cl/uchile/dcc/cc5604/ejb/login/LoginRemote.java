package cl.uchile.dcc.cc5604.ejb.login;

import javax.ejb.Local;

@Local
public interface LoginRemote {

    public User login(String user, String password);
}
