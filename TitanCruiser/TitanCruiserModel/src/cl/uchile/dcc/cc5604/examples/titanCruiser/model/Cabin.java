package cl.uchile.dcc.cc5604.examples.titanCruiser.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cabin {

    @Id
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
