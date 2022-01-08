package Galaxy.Planets;

import Galaxy.Interfaces.PlanetInterface;

import java.util.ArrayList;

public class Taldain extends Planet implements PlanetInterface {

    public String name() {return getClass().getSimpleName();}

    public String getShard() {
        return "Niezależność";}

    public ArrayList<String> magicSystems() {
        ArrayList<String> magic = new ArrayList<>();
        magic.add("Mistrzostwo piasku");
        return magic;
    }
}
