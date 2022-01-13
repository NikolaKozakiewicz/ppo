package Galaxy.MagicUsers;

import java.util.ArrayList;

public class Windrunner extends MagicUser {

    private String type = "Wiatrowy";

    public Windrunner(String type) {super(type);}

    @Override
    public ArrayList<Power> getPowers() {
        ArrayList<Power> powers = new ArrayList<>();
        powers.add(new Power("Grawitacja", 10));
        powers.add(new Power("Przyczepność", 5));

        return powers;
    }
}
