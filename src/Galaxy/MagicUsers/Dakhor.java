package Galaxy.MagicUsers;

import java.util.ArrayList;

public class Dakhor extends MagicUser {

    private String type = "Mnich Dokhoru";

    public Dakhor(String type) {super(type);}

    @Override
    public ArrayList<Power> getPowers() {
        ArrayList<Power> powers = new ArrayList<>();
        powers.add(new Power("Wzmocniony cios", 25));
        powers.add(new Power("Strach", 10));

        return powers;
    }
}
