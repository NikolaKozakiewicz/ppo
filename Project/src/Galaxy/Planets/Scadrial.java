package Galaxy.Planets;

import Galaxy.Interfaces.PlanetInterface;
import Galaxy.Investiture.Allomancy;
import Galaxy.Investiture.Feruchemy;
import Galaxy.Investiture.Hemalurgy;
import Galaxy.Investiture.Investiture;

import java.util.ArrayList;

public class Scadrial extends Planet implements PlanetInterface {

    public String name() {return getClass().getSimpleName();}

    public String getShard() {
        return "Harmonia (dawniej Zachowanie i Zniszczenie)";}

    public String bookTitle() {return "'Z mgły zrodzony'";}

    public ArrayList<Investiture> magicSystems() {
        ArrayList<Investiture> magic = new ArrayList<>();

        magic.add(new Allomancy());
        magic.add(new Feruchemy());
        magic.add(new Hemalurgy());

        return magic;
    }
}
