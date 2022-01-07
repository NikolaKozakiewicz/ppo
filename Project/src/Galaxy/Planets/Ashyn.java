package Galaxy.Planets;

import Galaxy.Interfaces.PlanetInterface;

import java.util.ArrayList;

public class Ashyn extends Planet implements PlanetInterface {

    public String name() {return getClass().getSimpleName();}

    public String shard() {return null;}

    public ArrayList<String> magicSystems() {
        ArrayList<String> magic = new ArrayList<>();
        magic.add("Disease magic");
        return magic;
    }
}
