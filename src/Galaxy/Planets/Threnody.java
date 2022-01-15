package Galaxy.Planets;

import Galaxy.Interfaces.PlanetInterface;
import Galaxy.Investiture.Investiture;
import Galaxy.Investiture.Shadows;
import Galaxy.Log;
import Galaxy.Shards.Ambition;
import Galaxy.Shards.Autonomy;
import Galaxy.Shards.Shard;

import java.util.ArrayList;
import java.util.Scanner;

public class Threnody extends Planet implements PlanetInterface {

    public String name() {return getClass().getSimpleName();}

    public ArrayList<Shard> getShard() {
        ArrayList<Shard> shards = new ArrayList<>();

        shards.add(new Ambition());

        return shards;
    }

    public String bookTitle() {return "'Cienie dla Ciszy w Lasach Piekła'";}

    public ArrayList<Investiture> magicSystems() {
        ArrayList<Investiture> magic = new ArrayList<>();

        magic.add(new Shadows());

        return magic;
    }

    public void explore() {
        boolean trip = true;
        while (trip) {
            Log.info(Log.ANSI_CYAN + "Co chcesz robić na Trenie?");
            Log.info("[1] Zwiedzić ją?");
            Log.info("[2] Poznać magię?");
            Log.info("[x] Powrót" + Log.ANSI_RESET);
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextLine()) {
                case "1": {
                    Log.info(Log.ANSI_BLUE + Log.ANSI_RESET);
                    tripToThrenody();
                    break;
                }
                case "2": {
                    Log.info(Log.ANSI_BLUE + "Mieszkańców Trenu dręczy szczególna przypadłość, która sprawia, że po śmierci" +
                            "\nniektórzy z nich zmieniają się w coś, co uczeni Srebrnoświatła nazywają" +
                            "\nCieniami Umysłu. Duch nasycony dodatkowym Napełnieniem często pozostawia" +
                            "\nswój ślad na tej mocy. I może ono zachować świadomość po oddzieleniu od" +
                            "\npostaci Materialnej." + Log.ANSI_RESET);
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

    public void tripToThrenody() {
        boolean trip = true;
        while (trip) {
            Log.info(Log.ANSI_CYAN + "Chcesz porobić coś jeszcze?");
            Log.info("[1] Układ Trenu");
            Log.info("[2] Geografia planety");
            Log.info("[x] Nie trzeba");
            Scanner skan = new Scanner(System.in);
            switch (skan.nextLine()) {
                case "1": {
                    Log.info(Log.ANSI_BLUE + "Układ Trenu został wypaczony przez starożyny konflikt. Dawno temu," +
                            "\nwkrótce po Roztrzaskaniu, Odium zwarł się z Odpryskiem Ambicją i śmiertelnie go" +
                            "\nranił. Ambicja został później Rozszczepiony, choć nastąpiło to w innej lokalizacji." +
                            "\nBezpośrednie starcie między dwoma Odpryskami Adolnalsium wywarło ogromny wpływ na" +
                            "\nplanety układu. Choć sama bitwa miała miejsce w olbrzymiej pustce między planetami," +
                            "\na walka odbywała się głównie w innych Krainach, fale zniszczenia i zmiany przeszły" +
                            "\nna układ." + Log.ANSI_RESET);
                    break;
                }
                case "2": {
                    Log.info(Log.ANSI_BLUE + "Na planecie znajdują się dwa oddzielone od siebie kontynenty. Większy" +
                            "\nz nich został pochłonięty przez coś znanego jako ''Zło'', tajemniczą siłę o nieznanym" +
                            "\npochodzeniu. Pełzająca ciemność, straszliwa moc, która pochłonęła cały kontynent." +
                            "\nMniejszy z kontynentów jest w większości krainą niezbadaną i nienazwaną, z kilkoma" +
                            "\nbastionami cywilizacji, gdzie nawet największe wydają się nieukończone. Wybudowane" +
                            "\npośpiesznie przez uciekinierów zza oceanu." + Log.ANSI_RESET);
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
}
