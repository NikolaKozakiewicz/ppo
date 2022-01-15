package Galaxy.Planets;

import Galaxy.Interfaces.PlanetInterface;
import Galaxy.Investiture.Allomancy;
import Galaxy.Investiture.Feruchemy;
import Galaxy.Investiture.Hemalurgy;
import Galaxy.Investiture.Investiture;
import Galaxy.Log;
import Galaxy.Shards.Autonomy;
import Galaxy.Shards.Preservation;
import Galaxy.Shards.Ruin;
import Galaxy.Shards.Shard;

import java.util.ArrayList;
import java.util.Scanner;

public class Scadrial extends Planet implements PlanetInterface {

    public String name() {return getClass().getSimpleName();}

    public ArrayList<Shard> getShard() {
        ArrayList<Shard> shards = new ArrayList<>();

        shards.add(new Preservation());
        shards.add(new Ruin());

        return shards;
    }

    public String bookTitle() {return "'Z mgły zrodzony'";}

    public ArrayList<Investiture> magicSystems() {
        ArrayList<Investiture> magic = new ArrayList<>();

        magic.add(new Allomancy());
        magic.add(new Feruchemy());
        magic.add(new Hemalurgy());

        return magic;
    }

    public void explore() {
        boolean trip = true;
        while (trip) {
            Log.info(Log.ANSI_CYAN + "Co chcesz robić na Scadrialu?");
            Log.info("[1] Zwiedzić ją?");
            Log.info("[2] Poznać magię?");
            Log.info("[3] Poczytać o jej historii?");
            Log.info("[x] Powrót" + Log.ANSI_RESET);
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextLine()) {
                case "1": {
                    Log.info(Log.ANSI_BLUE + "Scadrial dzieli się na Północ i Południe. Północ przez tysiąc lat pozostawała pod władzą" +
                            "\nOstatniego Imperium, trzymającego te ziemie żelazną ręką. Dopiero trzysta lat temu świat został" +
                            "\nuwolniony i ludzkość zaczęła rozwijać się we własnym tempie. Południe zaś przez większośc czasu" +
                            "\npozostawało zapomniane, lecz przez ostatnie lata rozwinęło się technologicznie, wykorzystując magię" +
                            "\nmetali do budowania swoich wynalazków jak latające statki i medaliony obdarzające mocą." + Log.ANSI_RESET);
                    tripToScadrial();
                    break;
                }
                case "2": {
                    Log.info(Log.ANSI_BLUE + "Podstawową formą magii na Scadrialu są trzy Sztuki Metaliczne: Allomancja, Feruchemia" +
                            "\noraz Hemalurgia, z których wszystkie trzy skupiają się wokół szesnastu metali. Allomanci, spożywając" +
                            "\ndany metal mogą go spalać by uzyskać niezwykłe moce, zaś Ferrycie przechowują w metalach aspekty fizyczne" +
                            "\nbądź duchowe, które mogą potem wykorzystać. W przypadku Hemalurgii, zabicie kogoś metalowym kolcem odbiera" +
                            "\nmu moc, które ktoś inni może przejąć, wbijając kolec w swoje ciało. Allomanci i Ferryci mogą używać jedynie" +
                            "\njednego metalu. Wyjątkami od tej reguły są Zrodzeni z Młgy, którzy potrafią spalać wszystkie metale, a także" +
                            "\npełni Feruchemicy, którzy mogą gromadzić aspekty we wszystkich metalach." + Log.ANSI_RESET);
                    break;
                }
                case "3": {
                    Log.info(Log.ANSI_BLUE + "Historia Scadrialu obfituje w nieprzyjemne wydarzenia. Wiele tysiącleci temu świat ten był znacznie" +
                            "\nbardziej przyjazny, jednak z powodu przepowiedni związanej ze Zniszczeniem, człowiek imieniem Rashek uzyskał niemal" +
                            "\nboską moc, którą wykorzystał by zmienić ekologię planety, a nawet ją przemieścić. Doprowadziło to do początku" +
                            "\nOstatniego Imperium, które trwało przez tysiąc lat, do czasu aż po jego upadku terrisański uczony imieniem Sazed" +
                            "\nprzejął boską moc i doprowadził Scadrial do jego poprzedniego stanu, w ktorym rośliny i ludzie ponownie mogli przetrwać." + Log.ANSI_RESET);
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

    public void tripToScadrial() {
        boolean trip = true;
        while (trip) {
            Log.info(Log.ANSI_CYAN + "Chcesz porobić coś jeszcze?");
            Log.info("[1] Poczytać o technologii Scadrialu.");
            Log.info("[2] Szesnaście metali.");
            Log.info("[3] Mgliści, Ferryci i Podwójni");
            Log.info("[x] Nie trzeba");
            Scanner skan = new Scanner(System.in);
            switch (skan.nextLine()) {
                case "1": {
                    Log.info(Log.ANSI_BLUE + "Przez tysiąc lat Ostatnie Imperium celowo ograniczało postęp technologiczny," +
                            "\njednak po jego upadku świat zaczął się dynamicznie unowocześniać i wciągu zaledwie trzystu lat" +
                            "\npostały kolej, elektryczność oraz broń palna. Eksperymenty związane z technologię opartą" +
                            "\nna Sztukach Metalicznych rozpoczęły się względnie niedawno, lecz już w tej chwili istnieją" +
                            "\nzbudowane za jej pomocą latające statki, a także medaliony, które obdarzają zwyczajnych" +
                            "\nludzi metalicznymi mocami." + Log.ANSI_RESET);
                    break;
                }
                case "2": {
                    metals();
                    break;
                }
                case "3": {
                    Log.info(Log.ANSI_BLUE + "Mgliści/Allomaci – ludzie korzystający ze Sztuki Metalicznej zwanej Allomancją." +
                            "\nPotrafią spalać konkretne metale w swoim żołądku, aby zyskać w ten sposób nadnaturalne zdolnośc." +
                            "\nJeden Mglisty potrafi spalać wyłącznie jeden rodzaj metalu. Wyjątkiem od tej reguły są Zrodzeni z Mgły," +
                            "\nktórzy spalają wszystkie metale jednocześnie." +
                            "\nFerryci – ludzie korzystający ze Sztuki Metalicznej zwanej Feruchemią. Pozwala im magazynować w" +
                            "\nspecjalnych metalowych pierścianiach (metalmyślach) dany aspekt, by później móc do niego sięgnąć." +
                            "\nJeden Ferryta może magazynować jeden aspekt do jednego rodzaju metalu. Wyjątkiem są pełni Feruchemicy," +
                            "\nktórzy umieją magazynować wszystkie aspekty do każdego rodzaju metalmyśli." +
                            "\nPodwójni – rzadcy Metalowi, którzy posiadają po jednej umiejętności Allomantycznej, jak i" +
                            "\nFeruchemicznej. Zaczęli się pojawiać dopiero po upadku Ostatniego Imperium kiedy ludy Terris" +
                            "\nzaczęły łączyć z powszechnym ludem.");
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

    public void metals() {
        boolean trip = true;
        while (trip) {
            Log.info(Log.ANSI_CYAN + "Metale");
            Log.info("Fizyczne: [1] Żelazo; [2] Stal; [3] Cyna; [4] Cyna z ołowiem;");
            Log.info("Umysłowe: [5] Cynk; [6] Mosiądz; [7] Miedź; [8] Brąz;");
            Log.info("Duchowe: [9] Aluminium; [10] Duraluminium; [11] Chrom; [12] Nicrosil;");
            Log.info("Hybrydowe: [13] Złoto; [14] Elektrum; [15] Kadm; [16] Stop bizmutowy;");
            Log.info("[x] Powrót" + Log.ANSI_RESET);
            Scanner skan = new Scanner(System.in);
            switch (skan.nextLine()) {
                case "1": {
                    Log.info(Log.ANSI_BLUE + "Mgliści Szarpacze, którzy spalają żelazo, mogą Przyciągać pobliskie źródła " +
                            "\nmetalu i muszą przy tym Przyciągać je do swojego środka ciężkości." +
                            "\nFerryci Muskacze mogą magazynować swój ciężar w żelaznej metalmyśli. Podczas jej napełniania " +
                            "\nredukują swój ciężar, aby później móc do niej sięgnąć, by go zwiększyć." + Log.ANSI_RESET);
                    break;
                }
                case "2": {
                    Log.info(Log.ANSI_BLUE + "Mgliści Motenostrzelni, którzy spalają stal, mogą Odpychać pobliskie źródła metalu, " +
                            "\nprzy czym muszą je Odpychać od swojego środka ciężkości." +
                            "\nFerryci Stalowi Biegacze, mogą magazynować prędkość w stalowej metalmyśli. Podczas jej napełniania" +
                            "\nstają się spowolnieni, a później mogą do niej sięgnąć, by zwiększyć swoją prędkość." + Log.ANSI_RESET);
                    break;
                }
                case "3": {
                    Log.info(Log.ANSI_BLUE + "Mgliści Cynoocy, którzy spalają cynę, zwiększają wrażliwość swoich pięciu zmysłów" +
                            "\nwszystkich jednocześnie." +
                            "\nFerryci Szepcący mogą magazynować wrażliwość jednego z pięciu zmysłów w cynowej metalmyśli. Podczas" +
                            "\njej napełniania wrażliwość tego zmysłu się zmniejsza, a później mohą sięgnąć do metalmyśli, by" +
                            "\nwyostrzyć określony zmysł." + Log.ANSI_RESET);
                    break;
                }
                case "4": {
                    Log.info(Log.ANSI_BLUE + "Mgliści Cynozbrojni (zwani również Zbirami) spalają cynę z ołowiem, żeby zwiększyć swoją" +
                            "\nsiłę fizyczną, prędkośc i wytrzymałość, jak również zdolność regeneracji swojego ciała." +
                            "\nFerryci Brutale mogą magazynować siłę fizyczną e metalmyśli z cyny z ołowiem. Podczas jej napełnienia" +
                            "\nsłabną, a później mogą do niej sięgnąć, by zwiększyć swoją siłę." + Log.ANSI_RESET);
                    break;
                }
                case "5": {
                    Log.info(Log.ANSI_BLUE + "Mgliści Podżegacze spalają cynk, by rozpalać (pobudzać) uczucia pobliskich osób. Mogą pobudzać " +
                            "\nuczucia jednej osoby lub wszystkich na określonym terenie, mohą również skupić się na określonych uczuciach." +
                            "\nFerryci Błyskotliwi mogą magazynować bystrość umysłu w cynkowej metalmyśli. Podczas jej napełniania" +
                            "\nzmniejszają swoją zdolność myślenia i rozumowania, a później mogą sięgnąć do metalmyśli, by myśleć szybciej." + Log.ANSI_RESET);
                    break;
                }
                case "6": {
                    Log.info(Log.ANSI_BLUE + "Mgliści Uspokajacze spalają mosiądz, żeby uspokoić (stłumić) uczucia pobliskich jednostek. Mogą" +
                            "\ntłumić uczucia jednej osoby lub wszystkich na określonym terenie, mogą się również skupiać na na określonych uczuciach." +
                            "\nFerryci Ogniści mogą magazynować ciepło w mosiężnej metalmyśli. Podczas jej napełniania ochładzają się, a później mogą" +
                            "\ndo niej sięgnąć, by się ogrzać." + Log.ANSI_RESET);
                    break;
                }
                case "7": {
                    Log.info(Log.ANSI_BLUE + "Mgliści Chmury Miedzi (zwani również Dymiarzami) spalają miedź, żeby otoczyć się niewidzalną chmurą," +
                            "\nktóra ukrywa pobliskich Allomantów przed Szperaczami i chroni znajdujących się w pobliżu przed Allomancją wpływającą na uczucia." +
                            "\nFerryci Archiwiści mogą magazynować wspomnienia w miedzianej metalmyśli (miedziomyśli). Podczas napełniania" +
                            "\nwspomnienie to znika z ich umysłu, a w późniejszym czasie można je odzyskać bez żadnych zniekształceń." + Log.ANSI_RESET);
                    break;
                }
                case "8": {
                    Log.info(Log.ANSI_BLUE + "Mgliści Szperacze spalają brąż, żeby ''usłyszeć'' Allomantyczne impulsy wysyłane przez innych Allomantów" +
                            "\nspalających metale. Różne metale wysyłają różne impulsy." +
                            "\nFerryci Wartownicy mogą magazynować przytomność w brązowej metalmyśli. Podczas napełniania czują się senni, a później mogą" +
                            "\ndo niej sięgnąć, by zmniejszyć senność lub wyostrzyć zmysły." + Log.ANSI_RESET);
                    break;
                }
                case "9": {
                    Log.info(Log.ANSI_BLUE + "Zrodzony z Młgy, który spala aluminium, natychmiast metabolizuje wszystkie swoje metale bez żadnego dodatkowego" +
                            "\nefektu, pozbywając się w ten sposób wszystkich rezerw Allomantycznych." +
                            "\nMgliści, którzy mogą spalać aluminium, nazywani są Aluminiowymi Komarami ze względu na bezużyteczność tej zdolności" +
                            "\nbez pozostałych." +
                            "\nFerryci Jaźniowi mogą przechowywać w aluminiowej metalmyśli swoją duchową tożsamość. Jest to umiejętność, o której poza" +
                            "\nTerris rzako się wspomina, a nawet sami Terrisanie nie do końca ją rozumieją." +
                            "\nCzyste aluminium i niektóre jego stopy są bierne Allomantycznie – nie można ich Przyciągać ani Odpychać, za to można wykorzystywać" +
                            "\nje do ochrony przez Allomantycznym wpływem na uczucia. Aluminium ponadto jest odporne na większość innych systemów magicznych cosmere." + Log.ANSI_RESET);
                    break;
                }
                case "10": {
                    Log.info(Log.ANSI_BLUE + "Zrodzony z Mgły, który spala duraluminium, natychmiast spala wszystkie inne metale, które spalał w tym samym czasie" +
                            "\nuwalniając gwałtowny impuls ich mocy." +
                            "\nMgliści, którzy spalają duraluminium, nazywani są Duraluminiowymi Komarami, ze względu na bezużyteczność tej zdolności bez pozostałych." +
                            "\nFerryci Wiążący mogą magazynować duchowy związek w duraluminiowej metalmyśli. Podczas jej napełniania zmniejszają więź i przyjaźń, jaką" +
                            "\nczują wobec nich inni, a później mogą sięgnąć do metalmyśli, by szybko nawiązywać przyjaźnie." + Log.ANSI_RESET);
                    break;
                }
                case "11": {
                    Log.info(Log.ANSI_BLUE + "Mgliści Pijawki, którzy spalają chrom, jednocześnie dotykając innego Allomanty, niszczą wszystkie rezerwy metalu" +
                            "\ntego Allomanty." +
                            "\nFerryci Obrotowi mogą magazynować szczęście w chromowej metalmyśli. Podczas jej napełniania mają większego pecha, a później mogą" +
                            "\ndo niej sięgnąć, by zwiększyć swoje szczęście." + Log.ANSI_RESET);
                    break;
                }
                case "12": {
                    Log.info(Log.ANSI_BLUE + "Mgliści Wybuchowi, którzy spalają nicrosil, jednocześnie dotykając innego Allomanty, natychmiast spalają wszystkie" +
                            "\nmetale, które w danej chwili spalał inny Allomanta, uwalniając gwałtowny (i być może niespodziewany) wybuch mocy tych metali." +
                            "\nFerryci Duchowi mogą magazynować Napełnienie w metalmyśli z nicrosilu." + Log.ANSI_RESET);
                    break;
                }
                case "13": {
                    Log.info(Log.ANSI_BLUE + "Mgliści Wróżbici spalają złoto, by zobaczyć wizję siebie w przeszłości albo to, kim by się stali gdyby w przeszłości" +
                            "\ndokonali innego wyboru." +
                            "\nFerryci Krwiotwórcy moga magazynować zdrowie w złotej metalmyśli. Podczas jej napełniania czują się chorzy, by później, sięgając do niej," +
                            "\nuzdrowić się szybciej lub w sposób wykraczający poza normalne zdolności ludzkiego ciała." + Log.ANSI_RESET);
                    break;
                }
                case "14": {
                    Log.info(Log.ANSI_BLUE + "Mgliści Wyrocznie spalają elektrum, by zobaczyć jak mogłaby wyglądać ich przyszłość. Zazwyczaj ogranicza się to do zaledwie" +
                            "\nkilku sekund." +
                            "\nFerryci Szczytowcy mogą magazynować zdecydowanie w metalmyśli z elektrum. Podczas napełniania popadają w depresję, a później mogą do niej" +
                            "\nsięgnąć by wejśc w fazę maniakalną." + Log.ANSI_RESET);
                    break;
                }
                case "15": {
                    Log.info(Log.ANSI_BLUE + "Mgliści Impulsowcy spalają kadm, by spowolnić upływ czas w otaczającej ich bańce, przez co wydaje się, że w jej wnętrzu płynie" +
                            "\non wolniej. Dzięki temu z punktu widzenia Impulsowca wydarzenia na zewnątrz bańki biegną oszałamiająco szybko." +
                            "\nFerryci Sapacze moga magazynować oddech wewnątrz kadmowej metalmyśli. Podczas jej napełniania muszą hiperwentylować, by dostarczyć swoim ciałom" +
                            "\ndośc powietrza, a później mogą zaczerpnąć tchu z metalmyśli, by móc przez jakiś czas nie oddychać lub oddychać rzadziej." + Log.ANSI_RESET);
                    break;
                }
                case "16": {
                    Log.info(Log.ANSI_BLUE + "Mgliści Ślizgacze spalają stop bizmutowy, by przyśpieszyć upływ czasu w otaczającej ich niewielkiej bańce. Dzięki temu z punktu" +
                            "\nwidzenia Ślizgacza wydarzenia na zewnątrz bańki biegną bardzo wolno." +
                            "\nFerryci Pochłaniacze mogą przechowywać substancje odżywcze i kalorie w metalmyśli ze stopu bizmutowego. Podczas jej napełniania mogą jeść dużo" +
                            "\ni nie czują się przy tym najedzeni ani nie przybierają na wadze, a później mogą do niej sięgnąć, by wyzbyć się porzeby przyjmowania pokarmów." + Log.ANSI_RESET);
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
