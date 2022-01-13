package Galaxy.MagicUsers;

import java.util.ArrayList;

public class Feruchemist extends MagicUser {

    private String type = "Feruchemik";

    public Feruchemist(String type) {super(type);}

    @Override
    public ArrayList<Power> getPowers() {
        ArrayList<Power> powers = new ArrayList<>();
        powers.add(new Power("Cynoołowiowomyśl", 30));
        powers.add(new Power("Stalomyśl", 10));

        return powers;
    }
}
