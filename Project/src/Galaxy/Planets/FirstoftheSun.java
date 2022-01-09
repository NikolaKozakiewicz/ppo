package Galaxy.Planets;

import Galaxy.Interfaces.PlanetInterface;
import Galaxy.Investiture.Aviar;
import Galaxy.Investiture.Investiture;
import Galaxy.Shards.Autonomy;
import Galaxy.Shards.Shard;

import java.util.ArrayList;

public class FirstoftheSun extends Planet implements PlanetInterface {

    public String name() {return getClass().getSimpleName();}

    public String getShard() {
        ArrayList<Shard> shards = new ArrayList<>();

        shards.add(new Autonomy());

        return shards.toString();
    }

    public String bookTitle() {return "'Szósty ze Zmierzchu'";}

    @Override
    public ArrayList<Investiture> magicSystems() {
        ArrayList<Investiture> magic = new ArrayList<>();

        magic.add(new Aviar());

        return magic;
    }
}
