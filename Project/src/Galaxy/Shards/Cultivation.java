package Galaxy.Shards;

import Galaxy.Interfaces.ShardInterface;

public class Cultivation extends Shard implements ShardInterface {

    public String name() {return "Pielęgnacja";}

    public String vessel() {return "Koravelium Avast";}

    public String info() {return "Jeden z szesnastu Odprysków Adonalsium.";}

    public boolean alive() {return true;}
}
