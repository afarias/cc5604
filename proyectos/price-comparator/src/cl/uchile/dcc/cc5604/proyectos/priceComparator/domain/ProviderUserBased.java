package cl.uchile.dcc.cc5604.proyectos.priceComparator.domain;

/**
 * This class represents a provider based on a normal user.
 */
public class ProviderUserBased extends Provider {

    /** The user from which the provider is created from */
    private User user;

    public ProviderUserBased(User user) {
        super(user.getName());
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
