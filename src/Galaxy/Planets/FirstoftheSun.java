package Galaxy.Planets;

import Galaxy.Interfaces.PlanetInterface;
import Galaxy.Investiture.Aviar;
import Galaxy.Investiture.Investiture;
import Galaxy.Log;
import Galaxy.Shards.Autonomy;
import Galaxy.Shards.Shard;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FirstoftheSun extends Planet implements PlanetInterface {

    public String name() {return getClass().getSimpleName();}

    public ArrayList<Shard> getShard() {
        ArrayList<Shard> shards = new ArrayList<>();

        shards.add(new Autonomy());

        return shards;
    }

    public String bookTitle() {return "'Szósty ze Zmierzchu'";}

    @Override
    public ArrayList<Investiture> magicSystems() {
        ArrayList<Investiture> magic = new ArrayList<>();

        magic.add(new Aviar());

        return magic;
    }

    public void explore() {
        boolean trip = true;
        while (trip) {
            Log.info(Log.ANSI_CYAN + "Co chcesz robić na Pierwszej od Słońca?");
            Log.info("[1] Zwiedzić ją?");
            Log.info("[2] Poznać jej kulturę?");
            Log.info("[3] Poczytać o jej magii?");
            Log.info("[x] Powrót" + Log.ANSI_RESET);
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextLine()) {
                case "1": {
                    Log.info(Log.ANSI_BLUE + "Pierwsza od Słońca, jak sama nazwa wskazuje, jest pierwszą planetą" +
                            "\nswojego układu, zwanego Drominad. W większości jest pokryta oceanami, jednak znajdują" +
                            "\nsię na niej rozliczne wyspy:" +
                            "\n— Panteon to grupa około czterdziestu wysp. Wliczają się w to Patji, największa wyspa, " +
                            "\na także Sori. Patji to miejsce niegościnnych szczytów, ostrych klifów i głębokiej dżungli.\n" +
                            "\n— Wyspy Eelakin są ojczyzną ludu Eelakin. To około trzech tygodni wiosłowania z Panteonu.\n" +
                            "\n— Kontynent to duży, zamieszkały ląd, również w pobliżu Panteonu." + Log.ANSI_RESET);
                    break;
                }
                case "2": {
                    Log.info(Log.ANSI_BLUE + "Eelakin to samotni traperzy z wysp Eelakin. Cenią sobie umiejętność samodzielnego przetrwania." +
                            "\nMówią bardzo mało i czasami tygodniami milczą. Każdy nosi księgę, w której zapisuje swoje życie." +
                            "\nNa ostatniej stronie zostawiają krótką wiadomość każdemu łowcy, który ich znajdzie, gdy umrą," +
                            "\nczęsto prosząc rywala o opiekę nad ich ptakami. Żyją bardzo surowym i trudnym stylem życia." +
                            "\nPolegają na swoim Aviarze, aby ich chronić i rozwijają bardzo silne więzi ze swoimi ptakami." +
                            "\nMieszkańcy kontynentu mają tendencję do romantyzowania ich zdolności do życia w lesie," +
                            "\npodczas gdy traperzy woleliby żyć na wyspach bez drapieżników. Nieczęsto zadają pytania o sposoby" +
                            "\nżycia, zamiast tego po prostu akceptują je jako takie. Nazywają swoje dzieci według czasu ich narodzin" +
                            "\ni ich pozycji w kolejności urodzeń. Gdyby ktoś został nazwany Jedenasty z Rana, byłby jedenastym" +
                            "\ndzieckiem ich rodziców i urodziłby się rano.\n" +
                            "\n" +
                            "Mieszkańcy kontynentu są znacznie bardziej rozwinięci naukowo niż Eelakinowie. Kwestionują tradycje " +
                            "\ni starają się rozwijać zaawansowaną naukowo technologię. Uważają się za znacznie bardziej " +
                            "\nzaawansowanych niż Eelakinowie, chociaż szanują Eelakinów za ich wytrzymałość i odporność oraz " +
                            "\nich zdolność do życia na Panteonie.\n" +
                            "\n" +
                            "Ci Powyżej to kosmiczna rasa ludzi, którzy najprawdopodobniej nie pochodzą z Pierwszego Słońca. " +
                            "\nWprowadzają zaawansowaną technologię, ale są ostrożni, aby nie pozwolić mieszkańcom Kontynentu " +
                            "\nwyjść poza to, z czym są w stanie bezpiecznie sobie poradzić. Pozornie przypadkowo zostawiają " +
                            "\nnotatki w swoich urządzeniach, aby pomóc mieszkańcom kontynentu. " + Log.ANSI_RESET);
                    break;
                }
                case "3": {
                    Log.info(Log.ANSI_BLUE + "Wiele zwierząt na Pierwszej jest w stanie wykryć myśli innych stworzeń na planecie. " +
                            "\nIstnieją ogromne stworzenia morskie, które polują na inne zwierzęta, wykrywając ich wzorce myślowe. " +
                            "\nŁowcy Panteonu używają swoich Aviarów do maskowania swoich myśli. Są rośliny, które wysyłają myśli " +
                            "\nprzestraszonych lub rannych zwierząt, aby przyciągnąć drapieżniki, które walczą w pobliżu ich pnia. " +
                            "\nDrzewo żywi się martwymi zwłokami. Ogromne ptaki zwane Nocnymi Paszczami znajdują zdobycz za pomocą " +
                            "\nwyjątkowych zmysłów węchu i zdolności wyczuwania umysłów innych." +
                            "\n" +
                            "\nAviary, ptaki cenione przez traperów za swoje magiczne zdolności, takie jak blokowanie fal myśli, " +
                            "\nbronienie ich przed drapieżnikami, żyją tylko na Panteonie. Jeśli Aviar zostanie wykluty i wychowany " +
                            "\nw innym miejscu, nie będzie miał tej umiejętności. Wszystkie Aviary, niezależnie od wyspy, z której " +
                            "\npochodzą, udają się do pewnego odosobnionego miejsca na Patji, zwanego Okiem Patji kiedy są młode, " +
                            "\na gdy odchodzą, są obdarzone swoimi magicznymi zdolnościami." + Log.ANSI_RESET);
                    Random rand = new Random();
                    int chance = rand.nextInt(10);
                    if (chance==10) {
                        Log.info(Log.ANSI_YELLOW + "Zdobywasz pamiątkę: Pióro Aviara!" + Log.ANSI_RESET);
                    }
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
