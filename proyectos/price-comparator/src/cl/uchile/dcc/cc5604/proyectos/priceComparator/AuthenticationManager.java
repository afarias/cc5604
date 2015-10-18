package cl.uchile.dcc.cc5604.proyectos.priceComparator;

import cl.uchile.dcc.cc5604.proyectos.priceComparator.domain.User;
import cl.uchile.dcc.cc5604.proyectos.priceComparator.exceptions.AuthenticationException;

import javax.ejb.Remote;

/**
 * This class is responsible for offering authentication services.
 */
@Remote
public interface AuthenticationManager {

    /**
     * This method is responsible for authenticate a user.
     *
     * @param username The user's username.
     * @param password The user's password.
     *
     * @return A user representing the authenticated user.
     *
     * @throws AuthenticationException If the the username was not found or the password mismatch the user's true
     *                                 password.
     */
    public User login(String username, String password) throws AuthenticationException;
}
