package Galaxy.Planets;

import Galaxy.Interfaces.PlanetInterface;

import java.util.ArrayList;

public class Threnody extends Planet implements PlanetInterface {

    public String name() {return getClass().getSimpleName();}

    String getShard() {
        return "Ambicja";}

    public ArrayList<String> magicSystems() {
        ArrayList<String> magic = new ArrayList<>();
        magic.add("Cienie");
        return magic;
    }
}
