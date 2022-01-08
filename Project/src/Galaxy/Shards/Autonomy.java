package Galaxy.Shards;

import Galaxy.Interfaces.ShardInterface;

public class Autonomy extends Shard implements ShardInterface {

    public String name() {return "Niezależność";}

    public String vessel() {return "Bavadin";}

    public String info() {return "Jeden z szesnastu Odprysków Adonalsium.";}

    public boolean alive() {return true;}
}
