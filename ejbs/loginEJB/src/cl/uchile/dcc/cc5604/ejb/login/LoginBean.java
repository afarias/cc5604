package cl.uchile.dcc.cc5604.ejb.login;

import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 * Created by andres on 10/26/15.
 */
@Stateless
@Remote(LoginRemote.class)
public class LoginBean implements LoginRemote {

    @Override
    public User login(String user, String password) {
        if (user.equalsIgnoreCase("afarias")){
            return new User("Andres");
        }
        else {
            return new User("Unknown");
        }
    }
}
