package Galaxy;

import Galaxy.Planets.Planet;

import java.util.ArrayList;
import java.util.Arrays;

public class Galaxy {

    private ArrayList<Planet> planets = new ArrayList<>();

    public Galaxy addPlanet(Planet planet) {
        planets.add(planet);
        return this;
    }
}
