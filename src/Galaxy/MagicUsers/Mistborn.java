package Galaxy.MagicUsers;

import java.util.ArrayList;

public class Mistborn extends MagicUser {

    private String type = "Zrodzony z Mgły";

    public Mistborn(String type) {super(type);}

    @Override
    public ArrayList<Power> getPowers() {
        ArrayList<Power> powers = new ArrayList<>();
        powers.add(new Power("Cyna z ołowiem", 25));
        powers.add(new Power("Stal", 10));

        return powers;
    }
}
