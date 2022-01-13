package Galaxy.MagicUsers;

import java.util.ArrayList;

public class Stoneward extends MagicUser {

    private String type = "Strażnik Kamienia";

    public Stoneward(String type) {super(type);}

    @Override
    public ArrayList<Power> getPowers() {
        ArrayList<Power> powers = new ArrayList<>();
        powers.add(new Power("Spojność", 15));
        powers.add(new Power("Napięcie", 20));

        return powers;
    }
}
