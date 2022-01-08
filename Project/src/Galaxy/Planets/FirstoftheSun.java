package Galaxy.Planets;

import Galaxy.Interfaces.PlanetInterface;

import java.util.ArrayList;

public class FirstoftheSun extends Planet implements PlanetInterface {

    public String name() {return getClass().getSimpleName();}

    public String getShard() {
        return "Niezależność (awatar Patji)";}

    public ArrayList<String> magicSystems() {
        ArrayList<String> magic = new ArrayList<>();
        magic.add("Aviary");
        return magic;
    }
}
