package Galaxy.Shards;

import Galaxy.Interfaces.ShardInterface;

public class Autonomy extends Shard implements ShardInterface {

    public String name() {
        return "Niezależność";
    }

    public String vessel() {
        return "Bavadin";
    }

    public String info() {
        return "Jeden z szesnastu Odprysków Adonalsium. Obecnie znajduje się na Taldainie." +
                "\nNiezależność chce pozostać sama; nie chce być zepsuta przez inne Odpryski" +
                "\ni uważa, że powinny najlepiej trzymać się same. Jednak to nie powstrzymuje " +
                "\njej przed mieszaniem się w cudze sprawy. Ze wszystkich Odprysków posiada jak" +
                "\ndotąd najwięcej awatarów, które objawiają się na wielu planetach.";
    }

    public boolean alive() {
        return true;
    }
}
