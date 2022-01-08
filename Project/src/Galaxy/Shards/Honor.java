package Galaxy.Shards;

import Galaxy.Interfaces.ShardInterface;

public class Honor extends Shard implements ShardInterface {

    public String name() {return "Honor";}

    public String vessel() {return "Tanavast";}

    public String info() {return "Jeden z szesnastu Odprysków Adonalsium.";}

    public boolean alive() {return false;}
}
