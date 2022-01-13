package Galaxy;

import Galaxy.Investiture.Investiture;
import Galaxy.Planets.Planet;
import Galaxy.Shards.Ambition;
import Galaxy.Shards.Shard;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Scanner;

public class FindShard {

    public ArrayList<Planet> showPlanets() { return Planet.giveList();}

    public ArrayList<Investiture> showInvestiture() {
        return Investiture.makeMagic();
    }

    public ArrayList<Shard> showShards() {
        return Shard.showShards();
    }

    public void knowShard() {
        Scanner scanner = new Scanner(System.in);

        try {
            while (true) {
                String shard = scanner.nextLine();
                this.findShard(shard);
            }
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }
    }

    private void findShard(String shard) throws Throwable {
        try {
            Method reflectedMethod = this.getClass().getDeclaredMethod(shard);
            reflectedMethod.setAccessible(true);
            reflectedMethod.invoke(this);
        } catch (NoSuchMethodException | IllegalAccessException e) {
            Log.info(Log.ANSI_GREEN + "Brak podanego Odprysku." + Log.ANSI_RESET);
        } catch (InvocationTargetException e) {
            throw new Exception(e.getTargetException().getMessage());
        }
    }

    private void Ambicja() throws Exception {
        show(0);
    }

    private void Niezależność() throws Exception {
        show(1);
    }

    private void Pielęgnacja() throws Exception {
        show(2);
    }

    private void Oddanie() throws Exception {
        show(3);
    }

    private void Dominacja() throws Exception {
        show(4);
    }

    private void Obdarowanie() throws Exception {
        show(5);
    }

    private void Honor() throws Exception {
        show(6);
    }

    private void Odium() throws Exception {
        show(7);
    }

    private void Zachowanie() throws Exception {
        show(8);
    }

    private void Zniszczenie() throws Exception {
        show(9);
    }

    private void powrót() throws Exception {
        throw new Exception(Log.ANSI_GREEN + "Koniec podróży." + Log.ANSI_RESET);
    }

    private void show(int a) {
        Log.info(Log.ANSI_GREEN + showShards().get(a).name() + Log.ANSI_RESET);
        Log.info(Log.ANSI_GREEN + "Naczynie: " + Log.ANSI_RESET + Log.ANSI_BLUE + showShards().get(a).getVessel() + Log.ANSI_RESET);
        if (showShards().get(a).isAlive()) {
            Log.info(Log.ANSI_GREEN + "Status: "+ Log.ANSI_RESET + Log.ANSI_BLUE + "żywy" + Log.ANSI_RESET);
        }
        else Log.info(Log.ANSI_GREEN + "Status: "+ Log.ANSI_RESET + Log.ANSI_BLUE + "strzaskany" + Log.ANSI_RESET);
    }
}
