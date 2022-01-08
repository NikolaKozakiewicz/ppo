package Galaxy.Planets;

import Galaxy.Interfaces.PlanetInterface;
import Galaxy.Investiture.Investiture;
import Galaxy.Investiture.Shadows;

import java.util.ArrayList;

public class Threnody extends Planet implements PlanetInterface {

    public String name() {return getClass().getSimpleName();}

    String getShard() {
        return "Ambicja";}

    public String bookTitle() {return "'Cienie dla Ciszy w Lasach Piekła'";}

    public ArrayList<Investiture> magicSystems() {
        ArrayList<Investiture> magic = new ArrayList<>();

        magic.add(new Shadows());

        return magic;
    }
}
