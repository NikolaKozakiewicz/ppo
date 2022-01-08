package Galaxy.Shards;

import Galaxy.Interfaces.ShardInterface;

public class Ruin extends Shard implements ShardInterface {

    public String name() {return "Zniszczenie";}

    public String vessel() {return "Ati";}

    public String info() {return "Jeden z szesnastu Odprysków Adonalsium.";}

    public boolean alive() {return false;}
}
