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

        boolean trip = true;
        Scanner scanner = new Scanner(System.in);

        Log.info("Witaj w Cosmere!");

        while(trip) {
            Log.info("Co chcesz poznać?");
            Log.info(Log.ANSI_GREEN + "Planety :: Odpryski :: Magia :: Pojedynki :: Koniec" + Log.ANSI_RESET);
            switch (scanner.nextLine()) {
                case "Planety": {
                    galaxy.explorePlenets();
                    break;
                }
                case "Odpryski": {
                    galaxy.giveShards();
                    break;
                }
                case "Magia": {
                    galaxy.exploreMagic();
                    break;
                }
                case "Pojedynki": {
                    Log.info(Log.ANSI_PURPLE + "Witamy na arenie magii!" + Log.ANSI_RESET);
                    Log.pause();
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
