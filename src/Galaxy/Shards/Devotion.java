package Galaxy.Shards;

import Galaxy.Interfaces.ShardInterface;

public class Devotion extends Shard implements ShardInterface {

    public String name() {
        return "Oddanie";
    }

    public String vessel() {
        return "Aona";
    }

    public String info() {
        return "Jeden z szesnastu Odprysków Adonalsium. Wcześniej na planecie Sel." +
                "\nOdprysk Oddanie trafił a ręce Aony, która razem z Dominacją udała się" +
                "\nna planetę Sel, lecz oboje zostali Strzaskani przez Odium, zaś ich moc" +
                "\npozostała uwięziona na planecie pod postacią magii Dor, która starając" +
                "\nsię uwolnić, zasila rozliczne rodzaje magii na Sel.";
    }

    public boolean alive() {
        return false;
    }
}
