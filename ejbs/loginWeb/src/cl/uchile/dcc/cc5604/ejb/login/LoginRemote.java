package cl.uchile.dcc.cc5604.ejb.login;

import javax.ejb.Remote;

@Remote
public interface LoginRemote {

    public User login(String user, String password);
}
