package cl.uchile.dcc.cc5604.jstl.displaytag;

import java.util.ArrayList;
import java.util.List;

public class CitiesFactory {

    private final List<City> cities;

    private static final CitiesFactory singleton = new CitiesFactory();

    private CitiesFactory() {
        this.cities = new ArrayList<City>();

        this.cities.add(new City("Santiago", "RM", 7000000));
        this.cities.add(new City("Valdivia", "X", 500000));
    }

    private List<City> getCities() {
        return cities;
    }

    public static List<City> getAllCities(){
        return singleton.getCities();
    }
}
