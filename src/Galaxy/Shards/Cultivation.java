package Galaxy.Shards;

import Galaxy.Interfaces.ShardInterface;

public class Cultivation extends Shard implements ShardInterface {

    public String name() {
        return "Pielęgnacja";
    }

    public String vessel() {
        return "Koravelium Avast";
    }

    public String info() {
        return "Jeden z szesnastu Odprysków Adonalsium. Znajduje się na planecie Roshar." +
                "\nOdprysk Adonalsium został przejęty przez zmiennokształtną smoczycę o imieniu " +
                "\nKoravelium Avast (zwaną na Rosharze też Koravari). W przeszłości Koravellium" +
                "\nbyła w związku z Tanavastem, Naczyniem Honoru i współnie przybyli na Roshar," +
                "\ngdzie później uwięzili większość mocy Odium na Braize.";
    }

    public boolean alive() {
        return true;
    }
}
