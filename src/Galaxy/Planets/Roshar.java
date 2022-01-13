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
                    Log.info(Log.ANSI_BLUE + "Roshar to świat zróżnicowany geograficznie, jak i kulturowo. Rozliczne państwa," +
                            "\nktórych tradycje i wierzenia przeplatają się ze sobą są cechą charakterystyczną Rosharu." +
                            "\nKlimat oraz natura planety jest unikalna i wyjątkowa. Najbardziej znane są niebezpieczne," +
                            "\nmagiczne burze nazywane Arcyburzami, przenoszącymi Burzowe Światło, będące nie tylko źródłem" +
                            "\nświatła, ale też paliwem dla Wiązania Mocy, jak i magicznych wynalazków. Istotne w krajobrazie" +
                            "\nRosharu są wszechobecnie występujące spreny: niewielkie byty będące ucieleśnieniem natury i emocji." + Log.ANSI_RESET);
                    tripToRoshar();
                    break;
                }
                case "2": {
                    Log.info(Log.ANSI_BLUE + "Wiązanie Mocy jest mocą pochodzącą z połączenia Odprysków Honoru i Pielęgnacji." +
                            "\nLudzie korzystają z Wiązania Mocy to Mocogwiązcy, zwani też Świetlistymi, tworzącymi dziesięć" +
                            "\nzakonów Świetlistych Rycerzy, podążających za swoimi ideałami." +
                            "\nMoc pojawia się wówczas gdy człowiek wejdzie w więź z samoświadomym sprenem. Zależnie od gatunku" +
                            "\nsprena, człowiek przynależy do innego Zakonu. Każdy Zakon ma swojego patrona w postaci Herolda" +
                            "\noraz włada dwiema z dziesięciu Mocy." + Log.ANSI_RESET);
                    break;
                }
                case "3": {
                    Log.info(Log.ANSI_BLUE + "Tysiące lat temu Roshar co jakiś czas pustoszyły straszliwe wojny z nieumarłymi wojownikami" +
                            "\nStopionymi, posługującymi się mocą Wiązania Pustki. Wojny zostałe nazwane" +
                            "\nSpustoszeniami. Wówczas dziesięcioro Heroldów przybywało na planetę by bronić ludzkości przy pomocy" +
                            "\nŚwietlistych Rycerzy, posługujących się Wiązaniem Mocy." +
                            "\nZ czasem jednak kataklizmy pojawiały się zbyt często, co niemal doprowadziło Roshar do całkowitego zniszczenia. " +
                            "\nDziało się tak jednak do czasu kiedy niespodziewanie ponad cztery lat temu walki nagle ustały. " +
                            "\nPrzez ten czas ludzkość rozwijała się powoli zapominając o tamtych wydarzeniach i biorąc udział w własnych wojnach," +
                            "\nzaś Świetliści Rycerze z czasem przestali się pojawiać i ostatecznie ludzkość zaczęła nazywać ich zdrajcami. " +
                            "\nLecz niedawno Stopieni zaczynają powracać, zatem nadszedł czas na nowo odbudować Zakony Świetlistych." + Log.ANSI_RESET);
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
            Log.info("[x] Nie trzeba" + Log.ANSI_RESET);
            Scanner skan = new Scanner(System.in);
            switch (skan.nextLine()) {
                case "1": {
                    Log.info(Log.ANSI_BLUE + "Z powodu pojawiających się na Rosharze niebezpiecznych, magicznych arcuburz," +
                            "\nfauna i flora Rosharu musiała się dostosować do surowego klimatu. W większości świata rośliny" +
                            "\ntakie jak trawa i drzewa nie rosną, a flora składa się głównie ze skałopąków, które otwierają się" +
                            "\nprzy słonecznej pogodzie, a zamykają w trakcie burzy. Zwierzęta są głównie skorupiakami i mogą" +
                            "\nto być zarówno małe kremliki wielkości dłoni, jak i morskie wielkoskorupy tak ogromne, że niektórzy" +
                            "\nludzie mieszkają na ich grzbietach jak na wyspie. Roślinność często tworzy specjalnie kieszenie" +
                            "\nlaitowe, w których rośliny rosną osłonięte przez burzami." + Log.ANSI_RESET);
                    break;
                }
                case "2": {
                    Log.info(Log.ANSI_BLUE + "Roshar stale rozwija się technologicznie, wykorzystując swoją magię przy budowie" +
                            "\nnierzadko zaawansowanych wynalazków, z czego najważniejszymi są fabriale, czyli przyrządy techniczne" +
                            "\nkorzystające z magii. Podstawowa budowa polega na zamknięciu w klejnocie szlachetnym sprena po to," +
                            "\nbywykorzystać jego moc. Istnieją fabriale ogrzewające czy leczące, ale także takie, które sprawiają" +
                            "\niż platformy latają, lub ludzie mogą ze sobą pisać na odległość." + Log.ANSI_RESET);
                    break;
                }
                case "3": {
                    surgebinders();
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

    public void surgebinders() {
        boolean trip = true;
        while (trip) {
            Log.info(Log.ANSI_CYAN + "Mocowiązcy");
            Log.info("[1] Wiatrowi; [2] Niebiańscy; [3] Pyłowcy; [4] Tancerze Krawędzi; [5] Widzący Prawdę");
            Log.info("[6] Tkacze Światła; [7] Przenosiciele; [8] Kształtujący Wolę; [9] Strażnicy Skał; [10] Kowale Więzi");
            Log.info("[x] Powrót" + Log.ANSI_RESET);
            Scanner skan = new Scanner(System.in);
            switch (skan.nextLine()) {
                case "1": {
                    Log.info(Log.ANSI_BLUE + "Wiatrowi" +
                            "\nSpren: honorspren");
                    Log.info("Kamień: szafir");
                    Log.info("Moce: Przyczepność i Grawitacja");
                    Log.info("Herold: Jezrien" + Log.ANSI_RESET);
                    break;
                }
                case "2": {
                    Log.info(Log.ANSI_BLUE + "Niebiańscy" +
                            "\nSpren: arcyspren");
                    Log.info("Kamień: kwarc dymny");
                    Log.info("Moce: Grawitacja i Podzielenie");
                    Log.info("Herold: Nalan" + Log.ANSI_RESET);
                    break;
                }
                case "3": {
                    Log.info(Log.ANSI_BLUE + "Pyłowcy" +
                            "\nSpren: popiołospren");
                    Log.info("Kamień: rubin");
                    Log.info("Moce: Podzielenie i Abrazja");
                    Log.info("Herold: Chanarach" + Log.ANSI_RESET);
                    break;
                }
                case "4": {
                    Log.info(Log.ANSI_BLUE + "Tancerze Krawędzi" +
                            "\nSpren: pielęgnacjospren");
                    Log.info("Kamień: diament");
                    Log.info("Moce: Abrazja i Rozwój");
                    Log.info("Herold: Vedel" + Log.ANSI_RESET);
                    break;
                }
                case "5": {
                    Log.info(Log.ANSI_BLUE + "Widzący Prawdę" +
                            "\nSpren: mgłospren");
                    Log.info("Kamień: szmaragd");
                    Log.info("Moce: Rozwój i Iluminacja");
                    Log.info("Herold: Paliah" + Log.ANSI_RESET);
                    break;
                }
                case "6": {
                    Log.info(Log.ANSI_BLUE + "Tkacze Światła" +
                            "\nSpren: kłamstwospren");
                    Log.info("Kamień: granat");
                    Log.info("Moce: Iluminacja i Transformacja");
                    Log.info("Herold: Shalash" + Log.ANSI_RESET);
                    break;
                }
                case "7": {
                    Log.info(Log.ANSI_BLUE + "Przenosiciele" +
                            "\nSpren: atramentospren");
                    Log.info("Kamień: cyrkon");
                    Log.info("Moce: Transformacja i Przenoszenie");
                    Log.info("Herold: Battar" + Log.ANSI_RESET);
                    break;
                }
                case "8": {
                    Log.info(Log.ANSI_BLUE + "Kształtujący Wolę" +
                            "\nSpren: światłospren");
                    Log.info("Kamień: ametyst");
                    Log.info("Moce: Przenoszenie i Spójność");
                    Log.info("Herold: Kalak" + Log.ANSI_RESET);
                    break;
                }
                case "9": {
                    Log.info(Log.ANSI_BLUE + "Strażnicy Skał" +
                            "\nSpren: szczytospren");
                    Log.info("Kamień: topaz");
                    Log.info("Moce: Spójność i Napięcie");
                    Log.info("Herold: Talenel" + Log.ANSI_RESET);
                    break;
                }
                case "10": {
                    Log.info(Log.ANSI_BLUE + "Kowale Więzi" +
                            "\nSpren: Ojciec Burz, Strażniczka Nocy, Rodzeństwo");
                    Log.info("Kamień: heliodor");
                    Log.info("Moce: Napięcie i Przyczepność");
                    Log.info("Herold: Ishar" + Log.ANSI_RESET);
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
