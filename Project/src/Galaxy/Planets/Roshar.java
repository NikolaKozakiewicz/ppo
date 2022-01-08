package Galaxy.Planets;

import Galaxy.Interfaces.PlanetInterface;

import java.util.ArrayList;

public class Roshar extends Planet implements PlanetInterface {

    public String name() {return getClass().getSimpleName();}

    public String getShard() {
        return "Honor, Pielęgnacja";}

    public ArrayList<String> magicSystems() {
        ArrayList<String> magic = new ArrayList<>();
        magic.add("Wiązanie Mocy");
        magic.add("Stara Magia");
        magic.add("Wiązanie Pustki");
        return magic;
    }
}
