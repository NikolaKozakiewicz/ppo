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
            Log.info(Log.ANSI_GREEN + "Planety :: Odpryski :: Magia :: Pojedynki :: Koniec" + Log.ANSI_RESET);
            switch (scanner.nextLine()) {
                case "Planety": {
                    Log.info(Log.ANSI_GREEN + "Wybierz miejsce docelowe:" + Log.ANSI_RESET);
                    for (int i=0; i<planets.size(); i++) {
                        Log.info(Log.ANSI_BLUE + planets.get(i).name() + Log.ANSI_RESET);
                    }
                    galaxy.explorePlenets();
                    break;
                }
                case "Odpryski": {
                    Log.info(Log.ANSI_GREEN + "Wybierz pożądany Odprysk:" + Log.ANSI_RESET);
                    for (int i=0; i<shards.size(); i++) {
                        Log.info(Log.ANSI_BLUE + shards.get(i).name() + Log.ANSI_RESET);
                    }
                    galaxy.giveShards();
                    break;
                }
                case "Magia": {
                    Log.info(Log.ANSI_GREEN + "Wybierz magię (bez spacji):" + Log.ANSI_RESET);
                    for (int i=0; i<investitures.size(); i++) {
                        Log.info(Log.ANSI_BLUE + investitures.get(i).name() + Log.ANSI_RESET);
                    }
                    galaxy.exploreMagic();
                    break;
                }
                case "Pojedynki": {
                    Log.info(Log.ANSI_PURPLE + "Witamy na arenie magii!" + Log.ANSI_RESET);
                    galaxy.startDuel();
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
