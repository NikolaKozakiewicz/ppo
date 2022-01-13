package Galaxy.MagicUsers;

import java.util.ArrayList;

public class Skybreaker extends MagicUser {

    private String type = "Niebiański";

    public Skybreaker(String type) {super(type);}

    @Override
    public ArrayList<Power> getPowers() {
        ArrayList<Power> powers = new ArrayList<>();
        powers.add(new Power("Podzielenie", 25));
        powers.add(new Power("Grawitacja", 10));

        return powers;
    }
}
