package Galaxy.Planets;

import Galaxy.Interfaces.PlanetInterface;
import Galaxy.Investiture.Investiture;
import Galaxy.Shards.Shard;

import java.util.ArrayList;

public abstract class Planet implements PlanetInterface {

    public abstract String name();
    abstract String bookTitle();
    abstract ArrayList<Shard> getShard();

    abstract ArrayList<Investiture> magicSystems();

    public ArrayList<Shard> shard() {return getShard(); };

    public ArrayList<Investiture> magic() {return magicSystems();}

    public String book() {return bookTitle();}

    public static ArrayList<Planet> giveList() {
        ArrayList<Planet> planets = new ArrayList<>();
        planets.add(new Ashyn());
        planets.add(new Braize());
        planets.add(new FirstoftheSun());
        planets.add(new Nalthis());
        planets.add(new Roshar());
        planets.add(new Scadrial());
        planets.add(new Sel());
        planets.add(new Taldain());
        planets.add(new Threnody());
        return planets;
    }
}
