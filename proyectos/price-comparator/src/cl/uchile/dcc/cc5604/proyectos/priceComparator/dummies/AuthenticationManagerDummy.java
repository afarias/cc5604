package cl.uchile.dcc.cc5604.proyectos.priceComparator.dummies;

import cl.uchile.dcc.cc5604.proyectos.priceComparator.AuthenticationManager;
import cl.uchile.dcc.cc5604.proyectos.priceComparator.domain.User;
import cl.uchile.dcc.cc5604.proyectos.priceComparator.exceptions.AuthenticationException;
import cl.uchile.dcc.cc5604.proyectos.priceComparator.exceptions.UserNotFoundException;
import cl.uchile.dcc.cc5604.proyectos.priceComparator.exceptions.WrongPasswordException;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;

/**
 * This is a dummy implementation.
 */
@Stateless
public class AuthenticationManagerDummy implements AuthenticationManager {

    /** A dummy user for Andres */
    private static final User afariasUser = new User("Andres");

    /** A dummy user */
    private static final User ivanUser= new User("Ivan");

    @Override
    public User login(String username, String password) throws AuthenticationException {

        if (username.equalsIgnoreCase("afarias")) {
            if (password.equals("afarias")){
                throw new WrongPasswordException();
            }
            return afariasUser;
        }

        else if (username.equalsIgnoreCase("ivan")){
            if (password.equals("ivan")){
                throw new WrongPasswordException();
            }
            return ivanUser;
        }

        throw new UserNotFoundException(username);
    }
}
