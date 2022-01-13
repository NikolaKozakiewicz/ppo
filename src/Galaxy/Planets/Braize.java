package Galaxy.Planets;

import Galaxy.Interfaces.PlanetInterface;
import Galaxy.Investiture.Investiture;
import Galaxy.Investiture.Voidbinding;
import Galaxy.Log;
import Galaxy.Shards.Odium;
import Galaxy.Shards.Shard;

import java.util.ArrayList;
import java.util.Scanner;

public class Braize extends Planet implements PlanetInterface {

    public String name() {return getClass().getSimpleName();}

    public ArrayList<Shard> getShard() {
        ArrayList<Shard> shards = new ArrayList<>();

        shards.add(new Odium());

        return shards;
    }

    public String bookTitle() {return "'Archiwum Burzowego Światła'";}

    @Override
    public ArrayList<Investiture> magicSystems() {
        ArrayList<Investiture> magic = new ArrayList<>();

        magic.add(new Voidbinding());

        return magic;
    }

    public void explore() {
        boolean trip = true;
        while (trip) {
            Log.info(Log.ANSI_CYAN + "Co chcesz robić na Braize?");
            Log.info("[1] Zwiedzić ją?");
            Log.info("[2] Poznać magię?");
            Log.info("[3] Poczytać o jej historii?");
            Log.info("[x] Powrót" + Log.ANSI_RESET);
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextLine()) {
                case "1": {
                    Log.info(Log.ANSI_BLUE + "Braize jest mroźnym światem, trzecią planetą układu Roshar." +
                            "\nMimo iż ludzie na niej nie mieszkają, przebywają na niej magiczne istoty" +
                            "\nzwane sprenami." +
                            "\nNiebezpieczne na Braize jest to, iż żyją na niej potężne, groźne istoty, zwane" +
                            "\nStopionymi, władającymi mocą Wiązania Pustki. Są to duchy ludzi, którzy od dawna" +
                            "\nnie żyją, lecz korzystając z boskiej mocy ofiarowej im przez Odium, zdołał osiągnąć" +
                            "\nnieśmiertelność, lecz z czasem każde z nich pogrążyło się w szaleństwie." + Log.ANSI_RESET);
                    break;
                }
                case "2": {
                    Log.info(Log.ANSI_BLUE + "Braize nie posiada własnego systemu magicznego, jednak z racji" +
                            "\niż to właśnie na niej przebywa Odprysk Odium oraz zastępy Stopionych, Braize jest" +
                            "\nprzepełniona mocą Wiązania Pustki. Podobne do Wiązania Mocy, ten rodzaj magii" +
                            "\njest niebezpieczny, skupiający się na potędze, zniszczeniu i nienawiści." +
                            "\nTak zwani Pustkowiązcy korzystają z dziewięciu rodzajów Mocy, które zapewniają im" +
                            "\nmonstrualne formy i nadludzkie umiejętności." + Log.ANSI_RESET);
                    break;
                }
                case "3": {
                    Log.info(Log.ANSI_BLUE + "To właśnie na Braize Odpryski Honoru i Pielęgnacji uwięziły" +
                            "\nOdprysk Odium. We współpracy z dziesięcioma Heroldami, zamknęli na planecie" +
                            "\ntakże i jego sługi, potężnych, niebezpiecznych Stopionych, władających" +
                            "\nmocami Wiązania Pustki. Jednakże przez tysiąclecia Stopieni wielokrotnie" +
                            "\npowracali na Roshar, wywołując wyniszczające wojny, które przeszły do historii" +
                            "\njako Spustoszenia. Braize zaś pozostaje w wierzeniach rosharańskich ludów" +
                            "\njako Potępienie." + Log.ANSI_RESET);
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
}
