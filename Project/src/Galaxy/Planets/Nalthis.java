package Galaxy.Planets;

import Galaxy.Interfaces.PlanetInterface;

import java.util.ArrayList;

public class Nalthis extends Planet implements PlanetInterface {

    public String name() {return getClass().getSimpleName();}

    public String getShard() {
        return "Obdarowanie";}

    public ArrayList<String> magicSystems() {
        ArrayList<String> magic = new ArrayList<>();
        magic.add("Rozbudzanie");
        return magic;
    }
}
