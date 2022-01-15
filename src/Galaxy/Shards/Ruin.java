package Galaxy.Shards;

import Galaxy.Interfaces.ShardInterface;

public class Ruin extends Shard implements ShardInterface {

    public String name() {
        return "Zniszczenie";
    }

    public String vessel() {
        return "Ati";
    }

    public String info() {
        return "Jeden z szesnastu Odprysków Adonalsium. Dawniej przebywający na Scadrialu." +
                "\nZniszczenie przybył do układu wraz z Zachowaniem, gdzie wspólnie stworzyli" +
                "\nplanetę i ludzi. Obowiązywał ich pakt, który pozwalał Zniszczeniu pewnego" +
                "\ndnia unicestwić to, co razem stworzyli. Dlatego też Zachowanie postanowił" +
                "\ngo złamać i poświęciwszy się, uwięził Zniszczenie. Po czasie on i Zachowanie" +
                "\nzostali scaleni w moc nazywaną Harmonią.";
    }

    public boolean alive() {
        return false;
    }
}
