package Galaxy.Shards;

import Galaxy.Interfaces.ShardInterface;

public class Odium extends Shard implements ShardInterface {

    public String name() {return "Odium";}

    public String vessel() {return "Rayse";}

    public String info() {return "Jeden z szesnastu Odprysków Adonalsium.";}

    public boolean alive() {return true;}
}
