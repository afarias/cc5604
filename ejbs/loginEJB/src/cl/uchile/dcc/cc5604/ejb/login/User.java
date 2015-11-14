package cl.uchile.dcc.cc5604.ejb.login;

import java.io.Serializable;

/**
 * Created by andres on 10/26/15.
 */
public class User  implements Serializable{
    private String password;
    private String username;

    public User(String andres) {
        this.username = andres;
    }

    public String getUsername() {
        return username;
    }
}
