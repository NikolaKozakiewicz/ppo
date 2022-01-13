package Galaxy.MagicUsers;

import Galaxy.Log;

import java.util.ArrayList;
import java.util.Random;

public abstract class MagicUser {
    Random rand = new Random();
    private String type;
    private int life_points;
    ArrayList<Power> powers = new ArrayList<>();

    MagicUser(String type) {
        this.type = type;
        this.life_points = 100;

        Log.info(this.type + " dołącza do walki.");
    }

    public void attack(MagicUser attacker, MagicUser opponent) {
        int move = rand.nextInt(attacker.powers.size());
        opponent.life_points -= attacker.powers.get(move).getDamage();

        Log.info(attacker.type + "atakuje: " + opponent.type + "za pomocą: " + powers.get(move));
    }

    public abstract ArrayList<Power> getPowers();
}
