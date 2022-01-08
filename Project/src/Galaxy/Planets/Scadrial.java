package Galaxy.Planets;

import Galaxy.Interfaces.PlanetInterface;

import java.util.ArrayList;

public class Scadrial extends Planet implements PlanetInterface {

    public String name() {return getClass().getSimpleName();}

    public String getShard() {
        return "Harmonia (dawniej Zachowanie i Zniszczenie)";}

    public ArrayList<String> magicSystems() {
        ArrayList<String> magic = new ArrayList<>();
        magic.add("Allomancja");
        magic.add("Feruchemia");
        magic.add("Hemalurgia");
        return magic;
    }
}
