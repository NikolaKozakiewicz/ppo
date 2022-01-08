package Galaxy.Planets;

import Galaxy.Interfaces.PlanetInterface;

import java.util.ArrayList;

public class Sel extends Planet implements PlanetInterface {

    public String name() {return getClass().getSimpleName();}

    public String getShard() {
        return "Dominacja, Oddanie";}

    public ArrayList<String> magicSystems() {
        ArrayList<String> magic = new ArrayList<>();
        magic.add("AonDor");
        magic.add("ChayShan");
        magic.add("Fałszerstwo");
        magic.add("Pięczecie Krwi");
        return magic;
    }
}
