package Galaxy.Shards;

import Galaxy.Interfaces.ShardInterface;

public class Odium extends Shard implements ShardInterface {

    public String name() {
        return "Odium";
    }

    public String vessel() {
        return "Rayse";
    }

    public String info() {
        return "Jeden z szesnastu Odprysków Adonalsium. Obecnie przebywa na Braize." +
                "\nOd samego początku, od Strzaskania, Odprysk Odium, będący esencję" +
                "\nzarówno nienawiści, jak i pasji, dążył do tego by pozostać jedynym" +
                "\nBogiem w cosmere. W przeszłości doprowadził do Roztrzaskania Oddania," +
                "\nDominacji i Honoru, zanim nie został uwięziony na Braize.";
    }

    public boolean alive() {
        return true;
    }
}
