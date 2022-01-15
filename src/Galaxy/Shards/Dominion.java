package Galaxy.Shards;

import Galaxy.Interfaces.ShardInterface;

public class Dominion extends Shard implements ShardInterface {

    public String name() {
        return "Dominacja";
    }

    public String vessel() {
        return "Skai";
    }

    public String info() {
        return "Jeden z szesnastu Odprysków Adonalsium. Wcześniej na planecie Sel." +
                "\nOdprysk Dominacja trafił a ręce Skaia, który razem z Oddaniem udał się" +
                "\nna planetę Sel, lecz oboje zostali Strzaskani przez Odium, zaś ich moc" +
                "\npozostała uwięziona na planecie pod postacią magii Dor, która starając" +
                "\nsię uwolnić, zasila rozliczne rodzaje magii na Sel.";
    }

    public boolean alive() {
        return false;
    }
}
