package Galaxy.MagicUsers;

import Galaxy.Log;

import java.util.ArrayList;
import java.util.Random;

public abstract class MagicUser {
    Random rand = new Random();
    private String type;
    private int life_points;

    MagicUser(String type) {
        this.type = type;
        this.life_points = 100;

        Log.info(Log.ANSI_PURPLE + this.type + " dołącza do walki." + Log.ANSI_RESET);
    }

    public void attack(MagicUser attacker, MagicUser opponent) {
        int move = rand.nextInt(attacker.getPowers().size());
        opponent.life_points = opponent.life_points - attacker.getPowers().get(move).getDamage();
        Log.info(Log.ANSI_BLUE + attacker.type + " ("+ attacker.life_points + ") atakuje: " + opponent.type + " ("+ opponent.life_points + ") za pomocą: " + getPowers().get(move).getName() + Log.ANSI_RESET);
        Log.info(Log.ANSI_BLUE + opponent.type + " ma teraz " + opponent.life_points + " zdrowia." + Log.ANSI_RESET);
        Log.info();
    }

    public ArrayList<Power> getPowers() {
        ArrayList<Power> powers = new ArrayList<>();
        powers.add(new Power("Aon Ehe",10));
        powers.add(new Power("Aon Daa",20));

        return powers;
    }

    public String getType() {return type;}

    public int giveLife() {return life_points;}
}
