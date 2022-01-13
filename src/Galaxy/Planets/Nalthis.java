package Galaxy.Planets;

import Galaxy.Interfaces.PlanetInterface;
import Galaxy.Investiture.Awakening;
import Galaxy.Investiture.Investiture;
import Galaxy.Log;
import Galaxy.Shards.Endowment;
import Galaxy.Shards.Shard;
import Galaxy.Souvenirs;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Nalthis extends Planet implements PlanetInterface {

    public String name() {return getClass().getSimpleName();}

    public ArrayList<Shard> getShard() {
        ArrayList<Shard> shards = new ArrayList<>();

        shards.add(new Endowment());

        return shards;
    }

    public String bookTitle() {return "'Rozjemca'";}

    @Override
    public ArrayList<Investiture> magicSystems() {
        ArrayList<Investiture> magic = new ArrayList<>();

        magic.add(new Awakening());

        return magic;
    }

    public void explore() {
        boolean trip = true;
        while (trip) {
            Log.info(Log.ANSI_CYAN + "Co chcesz robić na Nalthis?");
            Log.info("[1] Zwiedzić ją?");
            Log.info("[2] Poznać magię?");
            Log.info("[3] Poczytać o jej historii?");
            Log.info("[x] Powrót" + Log.ANSI_RESET);
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextLine()) {
                case "1": {
                    Log.info(Log.ANSI_BLUE + "Na Nalthis istnieje wiele krajów, wśród których należy wymienić górskie" +
                            "\nkrólestwo Idris, czy batwne, tropikalne imperium Hallandren." +
                            "Hallandren, ze stolicą w T'Tellir, otaczają dżungle, w których rosną niezwykłe kwiaty zwane Łzami Edgli, z których" +
                            "\nprodukowane są barwniki, będące potrzebne do korzystania z tutejszego systemu magicznego" +
                            "\nzwanego Rozbudzanie." + Log.ANSI_RESET);
                    tripToNalthis();
                    break;
                }
                case "2": {
                    Log.info(Log.ANSI_BLUE + "Każdy człowiek na Nalthis rodzi się z magicznym Oddechem, który jest podstawą do mocy Rozbudzania." +
                            "\nWykorzystując zebrane oddechy, pobierając kolor z nieożywionych przedmiotów wokół siebie i wypowiadając Rozkaz," +
                            "\nRozbudzający mogą sprawić iż przedmioty ożywają i wykonują ich Rozkazy. Jest to jednak skomplikowany proces" +
                            "\ni nie zawsze wypowiedzenie Rozkazu gwarantuje jego wykonanie. Oddechy można przekazywac między sobą, jednak Rozkaz" +
                            "\nmusi być wypowiedziany świadomie. Im więcej Oddechów posiada człowiek, tym bardziej ''boskie'' zdolności zyskuje," +
                            "\njak odporność na choroby i starzenie się, wzmocnione zmysły czy większe panowanie nad Rozbudzonymi przedmiotami." +
                            "\nNiezwykłym przypadkiem są Powracający, którymi są Rozbudzeni zmarli, do których trafia tak zwany Boski Oddech," +
                            "\nzapewniający im natychmiastowo wieczną młodość i nadludzkie zdolności. Powracający jednak tracą wszystkie" +
                            "\nwspomnienia jakie posiadali za życia." + Log.ANSI_RESET);
                    break;
                }
                case "3": {
                    Log.info(Log.ANSI_BLUE + "W pewnym momencie w odległej przeszłości Vo podróżował przez morze i stał się Powracającym, " +
                            "\ntworząc Hallandren, który zajął miejsce poprzedniego narodu, Pahn Kahl. Powracający stworzyli religię i naród, " +
                            "\nskupiając się na nich samych. Po pewnym czasie Pięciu Uczonych zebrało się i stało się katalizatorem Wielowojnia, " +
                            "\nco zaowocowało separacją narodu Idris (po tym, jak rodzina królewska opuściła Hallandren na rzecz Idris, ze spornych powodów)" +
                            "\noraz powstaniem Królów-Bogów i absolutyzmu Opalizujących Tonów .\n" +
                            "\n" +
                            "Około 300 lat po Wielowojniu wybuchł bunt Pahn Kahl. Było to również wtedy, gdy idriańska księżniczka Siri poślubiła " +
                            "\nKróla-Boga Susebrona, sprowadzając członka rodziny królewskiej z powrotem do Hallandren." + Log.ANSI_RESET);
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

    public void tripToNalthis() {
        boolean trip = true;
        while (trip) {
            Log.info(Log.ANSI_CYAN + "Chciałbyś zwiedzić Nalthis lepiej?");
            Log.info("[1] Zwiedź Idris");
            Log.info("[2] Zwiedź T'Tellir");
            Log.info("[3] Zwiedź Dwór Bogów");
            Log.info("[x] Nie trzeba");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextLine()) {
                case "1": {
                    Log.info(Log.ANSI_BLUE + "Idris leży na wyżynach, gdzie jego położenie umożliwia kontrolę nad czterema głównymi przełęczami handlowymi na północy." +
                            "\nIdris jest głównie wiejskie, a większość ludzi pracuje jako pasterze lub rolnicy. Większość ludzi wierzy w Austre, " +
                            "\na tradycją jest, że wszystkie rodziny, które dysponują wystarczającymi środkami, powinny wysłać przynajmniej " +
                            "\njedno dziecko do pracy w klasztorach. Ci mnisi poświęcają swoje życie pracy dla dobra biednych i nie gromadzą dla siebie bogactwa." +
                            "\nIdrianie uważają bogów Hallandren za dziwnych, a ich religię za nieprawdziwą." +
                            "\nKrólestwo jest szare i stosunkowo pozbawione kolorów, co odzwierciedla niechęć Idryjczyków do jakichkolwiek przejawów „ostentacji” " +
                            "\nw ich sposobie życia. Kamienne ściany są bielone, a ubrania utrzymywane w kolorze matowej szarości lub brązu, zgodnie z przesądem " +
                            "\nnauczającym, że może to uniemożliwić Rozbudzającym używanie kolorów do korzystania z magii." + Log.ANSI_RESET);
                    break;
                }
                case "2": {
                    Log.info(Log.ANSI_BLUE + "T'Telir jest przytłaczająco jasny, a główne obszary miasta są bardzo piękne i pełne zieleni. " +
                            "\nBudynki są tu malowane na wszystkie kolory, a ludzie ubierają się w żywe kolory, a niektórzy nawet farbują włosy." +
                            "\nPomniki D'Denirów, ogromne posągi wielkich wojowników trzymających broń w różnych pozach, stoją wzdłuż chodników " +
                            "\ni są często ozdobione przez ludzi jaskrawymi dodatkami, takimi jak szaliki i kapelusze." +
                            "\nT'Telir jest siedzibą Dworu Bogów, imponującej budowli miasta " +
                            "\nwzniesionej na płaskowyżu i całkowicie otoczoną murem. To tutaj Powracający " +
                            "\nmieszkają w swoich pałacach, każdy malowany innym kolorem i zbierają się co tydzień, " +
                            "\naby wydawać wyroki i osądzać mieszkańców\n" +
                            "\nInną godną uwagi cechą T'Telira są pemniki D'Denirów, imponujące posągi wojowników " +
                            "\nrzekomo pozostawionych jako pomnik tych, którzy zginęli w Wielowojniu i jako przypomnienie " +
                            "\ndla Hallandren o kosztach wojny. Pierwsze zostały pozostawione miastu przez Dawcę Pokoju" +
                            "\nzwane Błogosławionym, zaraz po Wielowojniu, choć nowe są zamawiane corocznie przez Powracających." + Log.ANSI_RESET);
                    Random rand = new Random();
                    int chance = rand.nextInt(10);
                    if (chance==10) {
                        Log.info(Log.ANSI_YELLOW + "Zdobywasz pamiątkę: Tkanina z T'Tellir!" + Log.ANSI_RESET);
                        break;
                    }
                }
                case "3": {
                    Log.info(Log.ANSI_BLUE + "Dwór Bogów jest siedzibą i parlamentem Powracających w Hallandren. Podczas gdy Powracający " +
                            "\nskutecznie rządzą narodem, są zamknięci w murach kompleksu w T'Telir, stolicy Hallandren.\n" +
                            "\nDwór Bogów składa się z pałacu Króla-Boga, wielopokojowego budynku pośrodku dziedzińca, w którym znajdują " +
                            "\nsię pomieszczenia w każdym odcieniu czerwieni, zieleni i błękitu. Pokoje nie mają określonej funkcji, " +
                            "\nponieważ służba wnosi wszystko, co jest potrzebne w dowolnym pomieszczeniu (np. wannę, stół jadalny, łóżko). " +
                            "\nWokół tej budowli stoją różne pałace Powracających, każdy w kolorach Powracającego, który w nim przebywa, " +
                            "\na także kapłani i personel, którzy się nimi opiekują. Kolory pałaców i służby są skoordynowane z kolorami " +
                            "\nboga w rezydencji." + Log.ANSI_RESET);
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
