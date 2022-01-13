package Galaxy.Shards;

import Galaxy.Interfaces.ShardInterface;

public class Endowment extends Shard implements ShardInterface {

    public String name() {return "Obdarowanie";}

    public String vessel() {return "Edgli";}

    public String info() {return "Jeden z szesnastu Odprysków Adonalsium.";}

    public boolean alive() {return true;}
}
