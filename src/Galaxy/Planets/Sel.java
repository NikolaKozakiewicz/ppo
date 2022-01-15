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

    public String name() {
        return getClass().getSimpleName();
    }

    public ArrayList<Shard> getShard() {
        ArrayList<Shard> shards = new ArrayList<>();

        shards.add(new Devotion());
        shards.add(new Dominion());

        return shards;
    }

    public String bookTitle() {
        return "'Elantris'; 'Dusza Cesarza'";
    }

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
                    Log.info(Log.ANSI_BLUE + "Sel przyciągnęła dwa Odpryski: Dominację i Oddanie. Zostały one jednak zniszczone już" +
                            "\nw czasach przehistorycznych, a obecnie większość Napełnienia ich mocy jest uwieziona w Krainie Umysłi." +
                            "\nMoce te zwane są Dor. Zamknięte razem i pragnące się wyzwolić zasilają rozliczne rodzaje magii na Sel." +
                            "\nMagia na Sel uzależniona jest w dużej mierze od miejsca przebywania, a moc słabnie w miarę oddalaja się" +
                            "\nod jej źródła. Na przykład Aony działają wokół miasta Elantris, zaś Fałszerstwo – wokół MaiPonu." + Log.ANSI_RESET);
                    break;
                }
                case "3": {
                    Log.info(Log.ANSI_BLUE + "Na kontynencie Opelon przez ostatnie stulecia największą Daminację posiada Imperium Fjordenu," +
                            "\nktóre rządzi w sposób teokratyczny. Na przestrzeni lat podbite zostały niemal wszystkie krainy kontynentu, zaś" +
                            "\njedyną nacją, która tak naprawdę pozostała był Arelon, pozostawiony przede wszystkim ze względu na magię Aonów." +
                            "\nDziesięć lat temu magia niespodziewanie zniknęła, zamieniając Elantryjczyków w brzydkie, podobne do trędowatych" +
                            "\nistoty, pozbawiając ich magii, do czasu kiedy młody król Raoden nie odkrył tajemnicy Elantris i nie przywrócił" +
                            "\nmu dawnej świetności." + Log.ANSI_RESET);
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
            Log.info("[1] Poznać Aony");
            Log.info("[2] Poczytać o geografii Sel.");
            Log.info("[3] Czym są Elantryjczycy?");
            Log.info("[x] Nie trzeba");
            Scanner skan = new Scanner(System.in);
            switch (skan.nextLine()) {
                case "1": {
                    aons();
                    break;
                }
                case "2": {
                    Log.info(Log.ANSI_BLUE + "Sel jest podzielona na trzy kontynnety, z których najlepiej znane są dwa:" +
                            "\nOpelon/Sycla, gdzie znajduje duże, dominacyjne Imperium Fjordeńskie, które w ciągu ostatnich" +
                            "\nkilku stuleci podbiło większość krain kontynentu, jak i Królestwo Arelonu, rządzone głównie" +
                            "\nprzez ludzi magicznie przeobrażonych w istoty zwane Elantryjczykami – istoty o srebrzystej" +
                            "\nskórze, białych włosach i umiejętnościach rzucania czarów." +
                            "\nPółnoc stanowi w większości Różane Imperium, leżące za górami i podzielone na liczne mniejsze" +
                            "\nprowincje. Jedynym znanym samodzielnym kontynentem jest Królestwo Teodu, kulturowo bardziej" +
                            "\nzbliżone do Arelonu, gdzie religia i zwyczaje są podobne, kręcące się wokół Aonów oraz Boga Domi." + Log.ANSI_RESET);
                }
                case "3": {
                    Log.info(Log.ANSI_BLUE + "Ludzie przemienieni w istoty o srebrzystej skórze i białych włosach, którzy potrafili" +
                            "\nkreślić Aeony i za ich pomocą rzucać czary. Każdy człowiek mógł stać się Elantryjczykiem poprzez" +
                            "\nzwany Shaod, Przeobrażeniem. Shaod uderza przypadkowo, zazwyczaj w nocy i może zabrać dowolną osobę" +
                            "\nniezalęznie od tego kim jest, jednak jedynym warunkiem jest to, że musi być pochodzenia aońskiego" +
                            "\noraz znajdować się w miarę niedaleko od miasta Elantris, gdzie mieszkają potem przez resztę życia." + Log.ANSI_RESET);
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

    public void aons() {
        Log.info(Log.ANSI_GREEN + "Lista Aonów:" + Log.ANSI_RESET);
        Log.info(Log.ANSI_BLUE + "Aon — Pierwszy, Język;" +
                "\nAan — Prawda, Fakt;" +
                "\nAeo — Odwaga;" +
                "\nAha — Oddech, Pwietrze;" +
                "\nAke — Kierunke Zachód;" +
                "\nAla — Piękno, Uroda;" +
                "\nAre — Jedność, Spójność;" +
                "\nAshe — Światło, Blask;" +
                "\nAta — Wdzięk, Gładkość;" +
                "\nAti — Nadzieja;" +
                "\nAto — Kierunek Północ;" +
                "\nDaa — Moc, Energia;" +
                "\nDao — Stabilność, Pewność;" +
                "\nDeo — Złoto, Metal;" +
                "\nDii — Drewno;" +
                "\nDio — Wierny, Nieporuszony;" +
                "\nEda — Wybitny, Wyniosły;" +
                "\nEdo — Ochrona, Bezpieczeństwo;" +
                "\nEhe — Ogień, Ciepło;" +
                "\nEla — Skupienie, Środek;" +
                "\nEna — Życzliwość;" +
                "\nEne — Dowcip, Bystrość;" +
                "\nEno — Woda;" +
                "\nEon — Siła woli, Wytrzymałość;" +
                "\nEshe — Dar, Uzdolnienie;" +
                "\nEto — Ciało, Mięśnie;" +
                "\nIad — Zaufanie, Solidny;" +
                "\nIal — Uczynność, Pomoc;" +
                "\nIdo — Miłosierdzie, Wybaczenie;" +
                "\nIen — Mądrość;" +
                "\nIre — Czar, Wiek;" +
                "\nKae — Kierunek Wschód;" +
                "\nKai — Spokój, Powaga;" +
                "\nKii — Sprawiedliwość;" +
                "\nMai — Honor;" +
                "\nMea — Troskliwość, Opieka;" +
                "\nNae — Wzrok, Jasność;" +
                "\nOmi — Miłość;" +
                "\nOpa — Kwiat" +
                "\nRao — Duch, Kwintesencja;" +
                "\nReo — Kara, Zemsta;" +
                "\nRii — Bogactwo, Zamożność;" +
                "\nSao — Inteligencja, Wiedza;" +
                "\nSea — Czystość, Wierność;" +
                "\nSeo — Lojalność, Służba;" +
                "\nShao — Przeobrażenie, Zmiana;" +
                "\nSheo — Śmierć;" +
                "\nSoi — Porządek, Zorganizowanie;" +
                "\nTae — Otwarty;" +
                "\nTeo — Władczy, Majestatyczny;" +
                "\nTia — Podróż, Transport;" +
                "\nToa — Kierunek Południe;" + Log.ANSI_RESET);
    }
}
