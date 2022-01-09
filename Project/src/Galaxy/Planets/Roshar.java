package Galaxy.Planets;

import Galaxy.Interfaces.PlanetInterface;
import Galaxy.Investiture.Investiture;
import Galaxy.Investiture.OldMagic;
import Galaxy.Investiture.Surgebinding;
import Galaxy.Investiture.Voidbinding;
import Galaxy.Shards.Autonomy;
import Galaxy.Shards.Cultivation;
import Galaxy.Shards.Honor;
import Galaxy.Shards.Shard;

import java.util.ArrayList;
import java.util.Arrays;

public class Roshar extends Planet implements PlanetInterface {

    public String name() {return getClass().getSimpleName();}

    public String getShard() {
        ArrayList<Shard> shards = new ArrayList<>();

        shards.add(new Honor());
        shards.add(new Cultivation());

        return shards.toString();
    }

    public String bookTitle() {return "'Archiwum Burzowego Światła'";}

    public ArrayList<Investiture> magicSystems() {
        ArrayList<Investiture> magic = new ArrayList<>();

        magic.add(new Surgebinding());
        magic.add(new OldMagic());
        magic.add(new Voidbinding());

        return magic;
    }

}
