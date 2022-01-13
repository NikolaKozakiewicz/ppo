package Galaxy.Shards;

import Galaxy.Interfaces.ShardInterface;

import java.util.ArrayList;

public abstract class Shard {

    public abstract String name();
    abstract String vessel();
    abstract String info();
    abstract boolean alive();

    public String getVessel() {return vessel();}

    public String getInfo() {return info();}

    public boolean isAlive() {return alive();}

    public static ArrayList<Shard> showShards() {
        ArrayList<Shard> shards = new ArrayList<>();

        shards.add(new Ambition());
        shards.add(new Autonomy());
        shards.add(new Cultivation());
        shards.add(new Devotion());
        shards.add(new Dominion());
        shards.add(new Endowment());
        shards.add(new Honor());
        shards.add(new Odium());
        shards.add(new Preservation());
        shards.add(new Ruin());

        return shards;
    }
}
