package Galaxy.Planets;

import Galaxy.Galaxy;
import Galaxy.Interfaces.PlanetInterface;
import Galaxy.Investiture.Investiture;
import Galaxy.Investiture.OldMagic;
import Galaxy.Investiture.Surgebinding;
import Galaxy.Investiture.Voidbinding;
import Galaxy.Log;
import Galaxy.Shards.Autonomy;
import Galaxy.Shards.Cultivation;
import Galaxy.Shards.Honor;
import Galaxy.Shards.Shard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Roshar extends Planet implements PlanetInterface {

    public String name() {return getClass().getSimpleName();}

    public ArrayList<Shard> getShard() {
        ArrayList<Shard> shards = new ArrayList<>();

        shards.add(new Honor());
        shards.add(new Cultivation());

        return shards;
    }

    public String bookTitle() {return "'Archiwum Burzowego Światła'";}

    public ArrayList<Investiture> magicSystems() {
        ArrayList<Investiture> magic = new ArrayList<>();

        magic.add(new Surgebinding());
        magic.add(new OldMagic());
        magic.add(new Voidbinding());

        return magic;
    }

    public void explore() {
        boolean trip = true;
        while (trip) {
            Log.info(Log.ANSI_CYAN + "Co chcesz robić na Rosharze?");
            Log.info("[1] Zwiedzić ją?");
            Log.info("[2] Poznać magię?");
            Log.info("[3] Poczytać o jej historii?");
            Log.info("[x] Powrót" + Log.ANSI_RESET);
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextLine()) {
                case "1": {
                    Log.info(Log.ANSI_BLUE + Log.ANSI_RESET);
                    tripToRoshar();
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

    public void tripToRoshar() {
        boolean trip = true;
        while (trip) {
            Log.info(Log.ANSI_CYAN + "Chcesz porobić coś jeszcze?");
            Log.info("[1] Zobaczyć faunę i florę Rosharu");
            Log.info("[2] Poznać magię fabriali");
            Log.info("[3] Poznać Mocowiązców");
            Log.info("[x] Nie trzeba");
        }
    }
}
