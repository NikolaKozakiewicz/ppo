package Galaxy;

import Galaxy.Investiture.Investiture;
import Galaxy.MagicUsers.MagicUser;
import Galaxy.Planets.Planet;
import Galaxy.Shards.Shard;

import java.util.ArrayList;
import java.util.Random;

public final class Galaxy {

    ArrayList<Planet> planets = Planet.giveList();
    ArrayList<Investiture> investitures = Investiture.makeMagic();
    ArrayList<Shard> shards = Shard.showShards();

    public void explorePlenets() {
        ExplorePlanets explorePlanets = new ExplorePlanets();
        Log.info(Log.ANSI_GREEN + "Wybierz miejsce docelowe:" + Log.ANSI_RESET);
        for (int i=0; i<planets.size(); i++) {
            Log.info(Log.ANSI_BLUE + planets.get(i).name() + Log.ANSI_RESET);
        }
        Log.info(Log.ANSI_BLUE + "(wpisz ''powrót'' jeśli chcesz wrócić)" + Log.ANSI_RESET);
        explorePlanets.explore();
    }

    public void giveShards() {
        FindShard findShard = new FindShard();
        Log.info(Log.ANSI_GREEN + "Wybierz pożądany Odprysk:" + Log.ANSI_RESET);
        for (int i=0; i<shards.size(); i++) {
            Log.info(Log.ANSI_BLUE + shards.get(i).name() + Log.ANSI_RESET);
        }
        Log.info(Log.ANSI_BLUE + "(wpisz ''powrót'' jeśli chcesz wrócić)" + Log.ANSI_RESET);
        findShard.knowShard();
    }

    public void exploreMagic() {
        ExploreMagic exploreMagic = new ExploreMagic();
        Log.info(Log.ANSI_GREEN + "Wybierz magię (bez spacji):" + Log.ANSI_RESET);
        for (int i=0; i<investitures.size(); i++) {
            Log.info(Log.ANSI_BLUE + investitures.get(i).name() + Log.ANSI_RESET);
        }
        Log.info(Log.ANSI_BLUE + "(wpisz ''powrót'' jeśli chcesz wrócić)" + Log.ANSI_RESET);
        exploreMagic.explore();
    }

    public void startDuel() {
        Duel duel = new Duel();
        ArrayList<MagicUser> participants;
        participants = duel.giveMagicUsers();
        Log.pause();

        while (participants.size() > 1) {
            Random rand = new Random();
            MagicUser attacker = participants.get(rand.nextInt(participants.size()));
            MagicUser target = attacker;

            while (attacker == target) {
                target = participants.get(rand.nextInt(participants.size()));
            }

            attacker.attack(attacker, target);
            if (target.giveLife() <= 0) {
                Log.info(Log.ANSI_RED + target.getType() + " odpada.\n" + Log.ANSI_RESET);
                participants.remove(target);
            }
        }
        Log.info(Log.ANSI_YELLOW + "Zwycięzcą jest " + participants.get(0).getType() + Log.ANSI_RESET);
        Log.info();
        Log.info(Log.ANSI_GREEN + "Powrót do menu." + Log.ANSI_RESET);
    }
}
