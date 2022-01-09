package Galaxy.Planets;

import Galaxy.Interfaces.PlanetInterface;
import Galaxy.Investiture.Investiture;
import Galaxy.Investiture.Voidbinding;
import Galaxy.Shards.Odium;
import Galaxy.Shards.Shard;

import java.util.ArrayList;

public class Braize extends Planet implements PlanetInterface {

    public String name() {return getClass().getSimpleName();}

    public String getShard() {
        ArrayList<Shard> shards = new ArrayList<>();

        shards.add(new Odium());

        return shards.toString();
    }

    public String bookTitle() {return "'Archiwum Burzowego Światła'";}

    @Override
    public ArrayList<Investiture> magicSystems() {
        ArrayList<Investiture> magic = new ArrayList<>();

        magic.add(new Voidbinding());

        return magic;
    }
}
