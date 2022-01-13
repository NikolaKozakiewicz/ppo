package Galaxy.MagicUsers;

import java.util.ArrayList;

public class Bloodsealer extends MagicUser{

    private String type = "Zrodzony z Mgły";

    public Bloodsealer(String type) {super(type);}

    @Override
    public ArrayList<Power> getPowers() {
        ArrayList<Power> powers = new ArrayList<>();
        powers.add(new Power("Ożywiony szkielet", 20));
        powers.add(new Power("Pieczęć Krwi", 5));

        return powers;
    }
}
