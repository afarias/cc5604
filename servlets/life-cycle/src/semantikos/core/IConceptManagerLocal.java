package semantikos.core;

import semantikos.model.Description;

import javax.ejb.Local;
import java.util.ArrayList;

/**
 * This interfaces defines the behaviour of the Concept Manger Component.
 */
@Local
public interface IConceptManagerLocal {

    /**
     * This method is responsible for retrieving the Description given by the ID.
     *
     * @param id The description ID.
     *
     * @return The description.
     */
    public ArrayList<Description> findDescriptionByIDConcept(int id);
}
