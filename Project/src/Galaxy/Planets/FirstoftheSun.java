package Galaxy.Planets;

import Galaxy.Interfaces.PlanetInterface;
import Galaxy.Investiture.Aviar;
import Galaxy.Investiture.Investiture;

import java.util.ArrayList;

public class FirstoftheSun extends Planet implements PlanetInterface {

    public String name() {return getClass().getSimpleName();}

    public String getShard() {
        return "Niezależność (awatar Patji)";}

    public String bookTitle() {return "'Szósty ze Zmierzchu'";}

    @Override
    public ArrayList<Investiture> magicSystems() {
        ArrayList<Investiture> magic = new ArrayList<>();

        magic.add(new Aviar());

        return magic;
    }
}
