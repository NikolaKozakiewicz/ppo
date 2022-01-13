package Galaxy.Shards;

import Galaxy.Interfaces.ShardInterface;

public class Dominion extends Shard implements ShardInterface {

    public String name() {return "Dominacja";}

    public String vessel() {return "Skai";}

    public String info() {return "Jeden z szesnastu Odprysków Adonalsium.";}

    public boolean alive() {return false;}
}
