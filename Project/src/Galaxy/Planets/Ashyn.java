package Galaxy.Planets;

import Galaxy.Interfaces.PlanetInterface;
import Galaxy.Investiture.DiseaseMagic;
import Galaxy.Investiture.Investiture;

import java.util.ArrayList;

public class Ashyn extends Planet implements PlanetInterface {

    public String name() {return getClass().getSimpleName();}

    public String getShard() {
        return "brak";}

    @Override
    public ArrayList<Investiture> magicSystems() {
        ArrayList<Investiture> magic = new ArrayList<>();

        magic.add(new DiseaseMagic());

        return magic;
    }
}
