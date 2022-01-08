import Galaxy.Investiture.Allomancy;
import Galaxy.Investiture.Investiture;
import Galaxy.Log;
import Galaxy.Galaxy;
import Galaxy.Planets.Planet;
import Galaxy.Planets.Roshar;
import Galaxy.Shards.Shard;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Galaxy galaxy = new Galaxy();

        Log.info("Witaj w Cosmere!");
        Log.info("Wybierz miejsce docelowe:");
        for (int i=0; i<galaxy.showPlanets().size(); i++) {
            Log.info(galaxy.showPlanets().get(i).name());
        }
        galaxy.explore();
    }
}
