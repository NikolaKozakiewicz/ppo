package Galaxy.Planets;

import Galaxy.Interfaces.PlanetInterface;
import Galaxy.Investiture.Awakening;
import Galaxy.Investiture.Investiture;
import Galaxy.Shards.Autonomy;
import Galaxy.Shards.Endowment;
import Galaxy.Shards.Shard;

import java.util.ArrayList;

public class Nalthis extends Planet implements PlanetInterface {

    public String name() {return getClass().getSimpleName();}

    public String getShard() {
        ArrayList<Shard> shards = new ArrayList<>();

        shards.add(new Endowment());

        return shards.toString();
    }

    public String bookTitle() {return "'Rozjemca'";}

    @Override
    public ArrayList<Investiture> magicSystems() {
        ArrayList<Investiture> magic = new ArrayList<>();

        magic.add(new Awakening());

        return magic;
    }
}
