package Galaxy.Shards;

import Galaxy.Interfaces.ShardInterface;

public class Preservation extends Shard implements ShardInterface {

    public String name() {
        return "Zachowanie";
    }

    public String vessel() {
        return "Leras";
    }

    public String info() {
        return "Jeden z szesnastu Odprysków Adonalsium. Dawniej przynależący do Scadrialu." +
                "\nZachowanie przybył do układu Scadrial kiedy był jeszcze całkiem pusty." +
                "\nWraz ze Zniszczeniem stworzyli wspólnie planetę, jak i ludzi, jednak" +
                "\nz powodu ich paktu, który obiecał Zniszczeniu unicestwienie wszystkiego" +
                "\nco stworzyli pewnego dnia, Zachowanie poświęcił się, by zbudować dla" +
                "\nniego więzienie. Ostatecznie on i Zniszczenie zostali scaleni w Harmonię.";
    }

    public boolean alive() {
        return false;
    }
}
