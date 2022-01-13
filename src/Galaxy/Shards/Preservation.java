package Galaxy.Shards;

import Galaxy.Interfaces.ShardInterface;

public class Preservation extends Shard implements ShardInterface {

    public String name() {return "Zachowanie";}

    public String vessel() {return "Leras";}

    public String info() {return "Jeden z szesnastu Odprysków Adonalsium.";}

    public boolean alive() {return false;}
}
