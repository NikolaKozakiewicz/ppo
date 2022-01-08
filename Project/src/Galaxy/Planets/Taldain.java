package Galaxy.Planets;

import Galaxy.Interfaces.PlanetInterface;
import Galaxy.Investiture.Investiture;
import Galaxy.Investiture.SandMastery;

import java.util.ArrayList;

public class Taldain extends Planet implements PlanetInterface {

    public String name() {return getClass().getSimpleName();}

    public String getShard() {
        return "Niezależność";}

    public String bookTitle() {return "'Biały piasek'";}

    public ArrayList<Investiture> magicSystems() {
        ArrayList<Investiture> magic = new ArrayList<>();

        magic.add(new SandMastery());

        return magic;
    }
}
