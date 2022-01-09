package Galaxy.Planets;

import Galaxy.Interfaces.PlanetInterface;
import Galaxy.Investiture.*;
import Galaxy.Shards.Autonomy;
import Galaxy.Shards.Devotion;
import Galaxy.Shards.Dominion;
import Galaxy.Shards.Shard;

import java.util.ArrayList;

public class Sel extends Planet implements PlanetInterface {

    public String name() {return getClass().getSimpleName();}

    public String getShard() {
        ArrayList<Shard> shards = new ArrayList<>();

        shards.add(new Devotion());
        shards.add(new Dominion());

        return shards.toString();
    }

    public String bookTitle() {return "'Elantris'; 'Dusza Cesarza'";}

    public ArrayList<Investiture> magicSystems() {
        ArrayList<Investiture> magic = new ArrayList<>();

        magic.add(new AonDor());
        magic.add(new ChayShan());
        magic.add(new Forgery());
        magic.add(new Bloodsealing());

        return magic;
    }
}
