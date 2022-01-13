package Galaxy.Planets;

import Galaxy.Interfaces.PlanetInterface;
import Galaxy.Investiture.DiseaseMagic;
import Galaxy.Investiture.Investiture;
import Galaxy.Log;
import Galaxy.Shards.Shard;

import java.util.ArrayList;
import java.util.Scanner;

public class Ashyn extends Planet implements PlanetInterface {

    public String name() {
        return getClass().getSimpleName();
    }

    public ArrayList<Shard> getShard() {
        ArrayList<Shard> shards = new ArrayList<>();
        return shards;
    }

    public String bookTitle() {
        return "'Boska Cisza'";
    }

    @Override
    public ArrayList<Investiture> magicSystems() {
        ArrayList<Investiture> magic = new ArrayList<>();

        magic.add(new DiseaseMagic());

        return magic;
    }

    public void explore() {
        boolean trip = true;
        while (trip) {
            Log.info(Log.ANSI_CYAN + "Co chcesz robić na Ashyn?");
            Log.info("[1] Zwiedzić ją?");
            Log.info("[2] Poznać magię?");
            Log.info("[3] Poczytać o jej historii?");
            Log.info("[x] Powrót" + Log.ANSI_RESET);
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextLine()) {
                case "1": {
                    Log.info(Log.ANSI_BLUE + "Ashyn nie jest przyjaznym światem. " +
                            "\nZ powodu starożytnej katastrofy, powierzchnia planety stała się gorąca i nieprzyjazna." +
                            "\nLudzie mieszkają w specjalnych strefach umożliwiających przetrwanie, z których" +
                            "\nnajsłynniejsze są bez wątpienia niesamowite latające miasta." +
                            "\nObecnie na Ashyn nie mieszka żaden Odprysk, choć pojawili się na niej Pielęgnacja i Odium." + Log.ANSI_RESET);
                    break;
                }
                case "2": {
                    Log.info(Log.ANSI_BLUE + "Magia Ashyn bazuje na chorobach. Żyjące na planecie bakterie i wirusy" +
                            "\nzapewniają ludziom niezwykłe moce, jednak efektem ubocznym jest pojawianie się" +
                            "\nobjawów chorobowych." +
                            "\nJedną z najważniejszych mocy jest ta, która zapewnia latanie. To ona jest używana by" +
                            "\nutrzymywać latające miasta. Niestety jej efektem ubocznym jest utrata słuchu." + Log.ANSI_RESET);
                    break;
                }
                case "3": {
                    Log.info(Log.ANSI_BLUE + "Kiedyś, dawno temu, Ashyn była zielona i pełna życia." +
                            "\nNiestety któregoś razu wydarzyła się na niej magiczna katasfrofa," +
                            "\nktóra zamieniła planetę w jałowe, płonące pustkowie. Szczegóły w jaki" +
                            "\nsposób doszło do kataklizmu, a także co go wywowało, do dziś pozostają" +
                            "\ntajemnicą."+ Log.ANSI_RESET);
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
