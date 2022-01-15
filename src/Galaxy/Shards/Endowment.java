package Galaxy.Shards;

import Galaxy.Interfaces.ShardInterface;

public class Endowment extends Shard implements ShardInterface {

    public String name() {
        return "Obdarowanie";
    }

    public String vessel() {
        return "Edgli";
    }

    public String info() {
        return "Jeden z szesnastu Odprysków Adonalsium. Urzędujący na planecie Nalthis." +
                "\nIntencją Obdarowania jest dawać, z tego powodu często wtrąca się w sprawy" +
                "\nśmiertelników, nierzadko wskrzeszając ich po śmierci pod postacią tak" +
                "\nzwanych Powracających, aczkolwiek odbiera im wspomnienia i uzależnia ich" +
                "\nod magicznej BioChromy, bez której nie potrafią przeżyć. Popiera również" +
                "\nindywidualizm Odprysków i uważa iż każdy z nich powinien działać sam.";
    }

    public boolean alive() {
        return true;
    }
}
