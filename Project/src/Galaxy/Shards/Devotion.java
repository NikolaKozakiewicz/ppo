package Galaxy.Shards;

import Galaxy.Interfaces.ShardInterface;

public class Devotion extends Shard implements ShardInterface {

    public String name() {return "Oddanie";}

    public String vessel() {return "Aona";}

    public String info() {return "Jeden z szesnastu Odprysków Adonalsium.";}

    public boolean alive() {return false;}
}
