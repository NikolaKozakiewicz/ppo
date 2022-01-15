package Galaxy;

import Galaxy.Investiture.Investiture;
import Galaxy.Planets.Planet;
import Galaxy.Shards.Shard;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Scanner;

public class ExploreMagic {

    public ArrayList<Investiture> showInvestiture() {
        return Investiture.makeMagic();
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
            Log.info(Log.ANSI_RED + "Brak podanego systemu magicznego." + Log.ANSI_RESET);
        } catch (InvocationTargetException e) {
            throw new Exception(e.getTargetException().getMessage());
        }
    }

    private void Allomancja() throws Exception {
        show(0);
    }

    private void AonDor() throws Exception {
        show(1);
    }

    private void Aviary() throws Exception {
        show(2);
    }

    private void Rozbudzanie() throws Exception {
        show(3);
    }

    private void Pieczęcie() throws Exception {
        show(4);
    }

    private void ChayShan() throws Exception {
        show(5);
    }

    private void MagiaChorób() throws Exception {
        show(6);
    }

    private void Feruchemia() throws Exception {
        show(7);
    }

    private void Fałszerstwo() throws Exception {
        show(8);
    }

    private void Hemalurgia() throws Exception {
        show(9);
    }

    private void StaraMagia() throws Exception {
        show(10);
    }

    private void Mistrzostwopiasku() throws Exception {
        show(11);
    }

    private void Cienie() throws Exception {
        show(12);
    }

    private void WiązanieMocy() throws Exception {
        show(13);
    }

    private void WiązaniePustki() throws Exception {
        show(14);
    }

    private void powrót() throws Exception {
        throw new Exception(Log.ANSI_GREEN + "Koniec podróży." + Log.ANSI_RESET);
    }

    private void show(int a) {
        Log.info(Log.ANSI_YELLOW + showInvestiture().get(a).name() + Log.ANSI_RESET);
        Log.info(Log.ANSI_GREEN + showInvestiture().get(a).getInfo() + Log.ANSI_RESET);
    }
}
