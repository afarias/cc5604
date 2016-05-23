package cl.uchile.dcc.cc5604.examples.titanCruiser.model;

import javax.ejb.Local;
import java.util.List;

@Local
public interface CountryManagerLocal {
    List<Country> getAllCountries();
}
