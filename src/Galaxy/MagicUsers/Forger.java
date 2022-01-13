package Galaxy.MagicUsers;

import java.util.ArrayList;

public class Forger extends MagicUser {

    private String type = "Fałszerz";

    public Forger(String type) {super(type);}

    @Override
    public ArrayList<Power> getPowers() {
        ArrayList<Power> powers = new ArrayList<>();
        powers.add(new Power("Pieczęć wojownika", 15));
        powers.add(new Power("Pieczęć zabójcy", 20));

        return powers;
    }
}
