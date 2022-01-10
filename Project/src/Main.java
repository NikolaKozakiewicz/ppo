import Galaxy.Investiture.Allomancy;
import Galaxy.Investiture.Investiture;
import Galaxy.Log;
import Galaxy.Galaxy;
import Galaxy.Planets.Planet;
import Galaxy.Planets.Roshar;
import Galaxy.Shards.Shard;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Galaxy galaxy = new Galaxy();
        ArrayList<Planet> planets = Planet.giveList();
        ArrayList<Investiture> investitures = Investiture.makeMagic();
        ArrayList<Shard> shards = Shard.showShards();

        boolean trip = true;
        Scanner scanner = new Scanner(System.in);

        Log.info("Witaj w Cosmere!");

        while(trip) {
            Log.info("Co chcesz poznać?");
            Log.info("Planety :: Odpryski :: Magia :: Koniec");
            switch (scanner.nextLine()) {
                case "Planety": {
                    Log.info("Wybierz miejsce docelowe:");
                    for (int i=0; i<planets.size(); i++) {
                        Log.info(planets.get(i).name());
                    }
                    galaxy.explorePlenets();
                    break;
                }
                case "Odpryski": {
                    Log.info("Wybierz pożądany Odprysk:");
                    for (int i=0; i<shards.size(); i++) {
                        Log.info(shards.get(i).name());
                    }
                    galaxy.giveShards();
                    break;
                }
                case "Magia": {
                    Log.info("Wybierz magię (bez spacji):");
                    for (int i=0; i<investitures.size(); i++) {
                        Log.info(investitures.get(i).name());
                    }
                    galaxy.exploreMagic();
                    break;
                }
                case "Koniec": {
                    trip = false;
                    break;
                }
                default: {
                    break;
                }
            }
        }

    }
}
