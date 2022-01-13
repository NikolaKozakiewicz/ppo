package Galaxy;

import Galaxy.MagicUsers.MagicUser;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public final class Galaxy {

    public void giveShards() {
        FindShard findShard = new FindShard();
        findShard.knowShard();
    }

    public void explorePlenets() {
        ExplorePlanets explorePlanets = new ExplorePlanets();
        explorePlanets.explore();
    }

    public void exploreMagic() {
        ExploreMagic exploreMagic = new ExploreMagic();
        exploreMagic.explore();
    }

    public void startDuel() {
        Duel duel = new Duel();
        ArrayList<MagicUser> participants;
        participants = duel.giveMagicUsers();

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
