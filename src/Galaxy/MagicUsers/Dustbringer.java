package Galaxy.MagicUsers;

import java.util.ArrayList;

public class Dustbringer extends MagicUser {

    private String type = "Pyłowiec";

    public Dustbringer(String type) {super(type);}

    @Override
    public ArrayList<Power> getPowers() {
        ArrayList<Power> powers = new ArrayList<>();
        powers.add(new Power("Podzielenie", 25));
        powers.add(new Power("Abrazja", 10));

        return powers;
    }
}
