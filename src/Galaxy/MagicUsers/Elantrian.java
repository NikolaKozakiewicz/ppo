package Galaxy.MagicUsers;

import java.util.ArrayList;

public class Elantrian extends MagicUser {

    private String type = "Elantryjczyk";

    public Elantrian(String type) {super(type);}

    @Override
    public ArrayList<Power> getPowers() {
        ArrayList<Power> powers = new ArrayList<>();
        powers.add(new Power("Aon Ehe", 15));
        powers.add(new Power("Aon Daa", 30));

        return powers;
    }
}
