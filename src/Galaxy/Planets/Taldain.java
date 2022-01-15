package Galaxy.Planets;

import Galaxy.Interfaces.PlanetInterface;
import Galaxy.Investiture.Investiture;
import Galaxy.Investiture.SandMastery;
import Galaxy.Log;
import Galaxy.Shards.Autonomy;
import Galaxy.Shards.Shard;

import java.util.ArrayList;
import java.util.Scanner;

public class Taldain extends Planet implements PlanetInterface {

    public String name() {return getClass().getSimpleName();}

    public ArrayList<Shard> getShard() {
        ArrayList<Shard> shards = new ArrayList<>();

        shards.add(new Autonomy());

        return shards;
    }

    public String bookTitle() {return "'Biały piasek'";}

    public ArrayList<Investiture> magicSystems() {
        ArrayList<Investiture> magic = new ArrayList<>();

        magic.add(new SandMastery());

        return magic;
    }

    public void explore() {
        boolean trip = true;
        while (trip) {
            Log.info(Log.ANSI_CYAN + "Co chcesz robić na Taldainie?");
            Log.info("[1] Zwiedzić ją?");
            Log.info("[2] Poznać magię?");
            Log.info("[3] Poczytać o jej historii?");
            Log.info("[x] Powrót" + Log.ANSI_RESET);
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextLine()) {
                case "1": {
                    tripToTaldain();
                    break;
                }
                case "2": {
                    Log.info(Log.ANSI_BLUE + "Taldain jest światem, nad którym panuje Odprysk Niezależność." +
                            "\nMistrzostwo piasku jest podstawową formą Napełniania na Taldainie." +
                            "\nMali chłopcy przejawiają zdolności panowania nad piaskiem już od najmłodszych lat," +
                            "\npóźniej wstępują do szkoły zwanej Diem, gdzie przez następne lata szkolą się na" +
                            "\nmistrzów piasku." +
                            "\nMagia piasku ma związek z mikroflorą pokrywającą piasek na Taldainie jak porosty." +
                            "\nRośliny te absorbują Napełnienie pochodzące od światła słonecznego, zmieniając jego" +
                            "\nkolor. Gdy jest w pełni Napełniony staje się jaskrawo biały, zaś gdy Napełnienie" +
                            "\nzostaje wyczerpane, przybiera barwę głębokiej czerni. Podlanie rośliny powoduje" +
                            "\nreakcję łańcuchową i krótkotrwały Związek magiczny. Mistrzowie piasku wykorzystują" +
                            "\nwodę z własnego ciała, by w ten sposób panować nad piaskiem." + Log.ANSI_RESET);
                    break;
                }
                case "3": {
                    Log.info(Log.ANSI_BLUE + "Od pewnego czasu droga na Taldain z Krainy Umysły pozostaje zamknięta," +
                            "\nza sprawą polityki izolacjonizmu prowadzącej ostatnio przez Niezależność." + Log.ANSI_RESET);
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

    public void tripToTaldain() {
        boolean trip = true;
        while (trip) {
            Log.info(Log.ANSI_CYAN + "Chcesz porobić coś jeszcze?");
            Log.info("[1] Poznać kosmologię Taldainu.");
            Log.info("[2] Dniostrona i Cieniostrona.");
            Log.info("[x] Nie trzeba");
            Scanner skan = new Scanner(System.in);
            switch (skan.nextLine()) {
                case "1": {
                    Log.info(Log.ANSI_BLUE + "Taldain jest planetą obracającą się synchronicznie, uwięzioną w punkcie" +
                            "\nlibracyjnym układu dwóch gwiazd. Mniejsza gwiazda jest białym karłem otoczonym przez" +
                            "\npierścień pyłowy, który z ciemnej strony planety jest ledwie widoczny. Mieszkańcy" +
                            "\nCieniostrony za stan naturalny uważają jednolitą ciemność, przypominającą zmierzch tuż po" +
                            "\nzachodzie słońca." +
                            "\nPo przeciwnej stronie planety leży Dniostrony, zwrócona w kierunku większej z dwóch gwiazd;" +
                            "\nbłękitnego nadolbrzyma, wokół którego krąży karzeł. Słońce jest jednym z kluczowych" +
                            "\nelementów Dniostrony, będącej w przeważającej części ogromną piaskową pustynią, a większość" +
                            "\nroślin i zwierząt żyje pod jej powierzchnią." + Log.ANSI_RESET);
                }
                case "2": {
                    Log.info("Dniostrona ma jeden, mniej więcej okrągły ląd, otoczony ze wszystkich stron oceanem. " +
                            "\nPo Dniostronie Taldainu jest sześć narodów; Kerzta, Lossand, Denka, Seevis," +
                            "\nNor'Tallon i Tallon. Po wschodniej stronie lądu znajduje się pasmo górskie," +
                            "\nktóre przebiega przez Nor'Tallon i graniczy z Seevis i Tallon. W centrum" +
                            "\nDniostrony leży góra o nazwie KraeDa." +
                            "\nDynastia jest najpotężniejszą i najbardziej wpływową siłą gospodarczą i polityczną" +
                            "\nna Cieniostronie. Rządzi nim Skathan. Dynastia chce się rozwijać i rozszerzać swoje " +
                            "\nwpływy, chociaż sprzeciwiają się jej inne pomniejsze narody, takie jak Elis. Jednak " +
                            "\npomimo tej opozycji moc Skathana tkwi głęboko w Cieniostronie, a on jest w stanie " +
                            "\nwysyłać swoich agentów do różnych grup na kontynencie.");
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
