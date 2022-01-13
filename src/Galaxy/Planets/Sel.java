package Galaxy.Planets;

import Galaxy.Interfaces.PlanetInterface;
import Galaxy.Investiture.*;
import Galaxy.Log;
import Galaxy.Shards.Autonomy;
import Galaxy.Shards.Devotion;
import Galaxy.Shards.Dominion;
import Galaxy.Shards.Shard;

import java.util.ArrayList;
import java.util.Scanner;

public class Sel extends Planet implements PlanetInterface {

    public String name() {return getClass().getSimpleName();}

    public ArrayList<Shard> getShard() {
        ArrayList<Shard> shards = new ArrayList<>();

        shards.add(new Devotion());
        shards.add(new Dominion());

        return shards;
    }

    public String bookTitle() {return "'Elantris'; 'Dusza Cesarza'";}

    public ArrayList<Investiture> magicSystems() {
        ArrayList<Investiture> magic = new ArrayList<>();

        magic.add(new AonDor());
        magic.add(new ChayShan());
        magic.add(new Forgery());
        magic.add(new Bloodsealing());

        return magic;
    }

    public void explore() {
        boolean trip = true;
        while (trip) {
            Log.info(Log.ANSI_CYAN + "Co chcesz robić na Sel?");
            Log.info("[1] Zwiedzić ją?");
            Log.info("[2] Poznać magię?");
            Log.info("[3] Poczytać o jej historii?");
            Log.info("[x] Powrót" + Log.ANSI_RESET);
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextLine()) {
                case "1": {
                    Log.info(Log.ANSI_BLUE + Log.ANSI_RESET);
                    tripToSel();
                    break;
                }
                case "2": {
                    Log.info(Log.ANSI_BLUE + Log.ANSI_RESET);
                    break;
                }
                case "3": {
                    Log.info(Log.ANSI_BLUE + Log.ANSI_RESET);
                    break;
                }
                case "x": {
                    trip = false;
                    break;
                }
                default: {
                    break;
                }
            }
        }
    }

    public void tripToSel() {
        boolean trip = true;
        while (trip) {
            Log.info(Log.ANSI_CYAN + "Chcesz porobić coś jeszcze?");
            Log.info("[1] Zobaczyć faunę i florę Rosharu");
            Log.info("[2] Poznać magię fabriali");
            Log.info("[3] Zobaczyć pojedynek Mocowiązców ");
            Log.info("[x] Nie trzeba");
        }
    }
}
