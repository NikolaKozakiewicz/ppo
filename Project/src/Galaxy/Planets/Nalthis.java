package Galaxy.Planets;

import Galaxy.Interfaces.PlanetInterface;
import Galaxy.Investiture.Awakening;
import Galaxy.Investiture.Investiture;

import java.util.ArrayList;

public class Nalthis extends Planet implements PlanetInterface {

    public String name() {return getClass().getSimpleName();}

    public String getShard() {
        return "Obdarowanie";}

    public String bookTitle() {return "'Rozjemca'";}

    @Override
    public ArrayList<Investiture> magicSystems() {
        ArrayList<Investiture> magic = new ArrayList<>();

        magic.add(new Awakening());

        return magic;
    }
}
