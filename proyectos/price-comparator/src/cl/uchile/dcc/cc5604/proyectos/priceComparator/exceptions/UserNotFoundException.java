package cl.uchile.dcc.cc5604.proyectos.priceComparator.exceptions;

import com.sun.istack.internal.NotNull;

/**
 * This method is responsible for collect the info of a user not found.
 */
public class UserNotFoundException extends AuthenticationException {

    /* The username that was not found */
    private String notFoundUsername;

    public UserNotFoundException(@NotNull String notFoundUsername) {
        this.notFoundUsername = notFoundUsername;
    }

    public String getNotFoundUsername() {
        return notFoundUsername;
    }
}
