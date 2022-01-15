package Galaxy.Shards;

import Galaxy.Interfaces.ShardInterface;

public class Ambition extends Shard implements ShardInterface {

    public String name() {
        return "Ambicja";
    }

    public String vessel() {
        return "Uli Da";
    }

    public String info() {
        return "Jeden z szesnastu Odprysków Adonalsium." +
                "\nPo Roztrzaskaniu Adonalsium Odprysk Ambicja został przejęty przez Uli Da" +
                "\nz rasy Sho Del. Jednak wkrótce później Ambicja została Rozszczepiona podczas" +
                "\nwalki z Odium w układzie Trenu.";
    }

    public boolean alive() {
        return false;
    }
}
