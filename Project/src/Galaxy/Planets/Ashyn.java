package Galaxy.Planets;

import Galaxy.Interfaces.PlanetInterface;
import Galaxy.Investiture.DiseaseMagic;
import Galaxy.Investiture.Investiture;
import Galaxy.Shards.Shard;

import java.util.ArrayList;

public class Ashyn extends Planet implements PlanetInterface {

    public String name() {return getClass().getSimpleName();}

    public ArrayList<Shard> getShard() {
        ArrayList<Shard> shards = new ArrayList<>();
        return shards;
    }

    public String bookTitle() {return "'Boska Cisza'";}

    @Override
    public ArrayList<Investiture> magicSystems() {
        ArrayList<Investiture> magic = new ArrayList<>();

        magic.add(new DiseaseMagic());

        return magic;
    }
}
