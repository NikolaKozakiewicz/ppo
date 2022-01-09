package Galaxy;

import Galaxy.Investiture.Investiture;
import Galaxy.Planets.Planet;
import Galaxy.Shards.Shard;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Scanner;

public class ExploreMagic {

    public ArrayList<Planet> showPlanets() {
        return Planet.giveList();
    }

    public ArrayList<Investiture> showInvestiture() {
        return Investiture.makeMagic();
    }

    public ArrayList<Shard> showShards() {
        return Shard.showShards();
    }

    public void explore() {
        Scanner scanner = new Scanner(System.in);

        try {
            while (true) {
                String magic = scanner.nextLine();
                this.findMagic(magic);
            }
        } catch (Throwable exception) {
            System.out.println(exception.getMessage());
        }
    }

    private void findMagic(String magic) throws Throwable {
        try {
            Method reflectedMethod = this.getClass().getDeclaredMethod(magic);
            reflectedMethod.setAccessible(true);
            reflectedMethod.invoke(this);
        } catch (NoSuchMethodException | IllegalAccessException e) {
            Log.info("Brak podanego systemu magicznego.");
        } catch (InvocationTargetException e) {
            throw new Exception(e.getTargetException().getMessage());
        }
    }

    private void Allomancja() throws Exception {
        Log.info(showInvestiture().get(0).name());
        showInvestiture().get(0).info();
    }

    private void AonDor() throws Exception {
        Log.info(showInvestiture().get(1).name());
        showInvestiture().get(1).info();
    }

    private void Aviary() throws Exception {
        Log.info(showInvestiture().get(2).name());
        showInvestiture().get(2).info();
    }

    private void Rozbudzanie() throws Exception {
        Log.info(showInvestiture().get(3).name());
        showInvestiture().get(3).info();
    }

    private void Pieczęcie() throws Exception {
        Log.info(showInvestiture().get(4).name());
        showInvestiture().get(4).info();
    }

    private void ChayShan() throws Exception {
        Log.info(showInvestiture().get(5).name());
        showInvestiture().get(5).info();
    }

    private void MagiaChorób() throws Exception {
        Log.info(showInvestiture().get(6).name());
        showInvestiture().get(6).info();
    }

    private void Feruchemia() throws Exception {
        Log.info(showInvestiture().get(7).name());
        showInvestiture().get(7).info();
    }

    private void Fałszerstwo() throws Exception {
        Log.info(showInvestiture().get(8).name());
        showInvestiture().get(8).info();
    }

    private void Hemalurgia() throws Exception {
        Log.info(showInvestiture().get(9).name());
        showInvestiture().get(9).info();
    }

    private void StaraMagia() throws Exception {
        Log.info(showInvestiture().get(10).name());
        showInvestiture().get(10).info();
    }

    private void Mistrzostwopiasku() throws Exception {
        Log.info(showInvestiture().get(11).name());
        showInvestiture().get(11).info();
    }

    private void Cienie() throws Exception {
        Log.info(showInvestiture().get(12).name());
        showInvestiture().get(12).info();
    }

    private void WiązanieMocy() throws Exception {
        Log.info(showInvestiture().get(13).name());
        showInvestiture().get(13).info();
    }

    private void WiązaniePustki() throws Exception {
        Log.info(showInvestiture().get(14).name());
        showInvestiture().get(14).info();
    }

    private void powrót() throws Exception {
        throw new Exception("Koniec podróży.");
    }
}
