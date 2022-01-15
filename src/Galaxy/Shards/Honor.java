package Galaxy.Shards;

import Galaxy.Interfaces.ShardInterface;

public class Honor extends Shard implements ShardInterface {

    public String name() {
        return "Honor";
    }

    public String vessel() {
        return "Tanavast";
    }

    public String info() {
        return "Jeden z szesnastu Odprysków Adonalsium. Dawniej na planecie Roshar." +
                "\nOdprysk Honoru trafił w ręce Tanavasta, będące przes Wstąpieniem w związku" +
                "\nz Koravelium Avast, która z kolei przyjęła Odprysk Pielęgnacji. Razem z nią" +
                "\nudał się na planetę Roshar, gdzie wspólnie stworzyli tamtejszą magię." +
                "\nOstatecznie Honor został Strzaskany przez Odium w trakcie jednej z dziesiątek" +
                "\npotyczek na Rosharze, ale zdołał uwięzić go na planecie Braize.";
    }

    public boolean alive() {
        return false;
    }
}
