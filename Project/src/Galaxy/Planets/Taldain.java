package Galaxy.Planets;

import Galaxy.Interfaces.PlanetInterface;
import Galaxy.Investiture.Investiture;
import Galaxy.Investiture.SandMastery;
import Galaxy.Shards.Autonomy;
import Galaxy.Shards.Shard;

import java.util.ArrayList;

public class Taldain extends Planet implements PlanetInterface {

    public String name() {return getClass().getSimpleName();}

    public String getShard() {
        ArrayList<Shard> shards = new ArrayList<>();

        shards.add(new Autonomy());

        return shards.toString();
    }

    public String bookTitle() {return "'Biały piasek'";}

    public ArrayList<Investiture> magicSystems() {
        ArrayList<Investiture> magic = new ArrayList<>();

        magic.add(new SandMastery());

        return magic;
    }
}
