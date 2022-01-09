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
            Log.info("Brak podanego Odprysku.");
        } catch (InvocationTargetException e) {
            throw new Exception(e.getTargetException().getMessage());
        }
    }

    private void Ambicja() throws Exception {
        Log.info(showShards().get(0).name());
        Log.info("Naczynie: " + showShards().get(0).getVessel());
        if (showShards().get(0).isAlive()) {
            Log.info("Status: żywy");
        }
        else Log.info("Status: strzaskany");
    }

    private void Niezależność() throws Exception {
        Log.info(showShards().get(1).name());
        Log.info("Naczynie: " + showShards().get(1).getVessel());
        if (showShards().get(1).isAlive()) {
            Log.info("Status: żywy");
        }
        else Log.info("Status: strzaskany");
    }

    private void Pielęgnacja() throws Exception {
        Log.info(showShards().get(2).name());
        Log.info("Naczynie: " + showShards().get(2).getVessel());
        if (showShards().get(2).isAlive()) {
            Log.info("Status: żywy");
        }
        else Log.info("Status: strzaskany");
    }

    private void Oddanie() throws Exception {
        Log.info(showShards().get(3).name());
        Log.info("Naczynie: " + showShards().get(3).getVessel());
        if (showShards().get(3).isAlive()) {
            Log.info("Status: żywy");
        }
        else Log.info("Status: strzaskany");
    }

    private void Dominacja() throws Exception {
        Log.info(showShards().get(4).name());
        Log.info("Naczynie: " + showShards().get(4).getVessel());
        if (showShards().get(4).isAlive()) {
            Log.info("Status: żywy");
        }
        else Log.info("Status: strzaskany");
    }

    private void Obdarowanie() throws Exception {
        Log.info(showShards().get(5).name());
        Log.info("Naczynie: " + showShards().get(5).getVessel());
        if (showShards().get(5).isAlive()) {
            Log.info("Status: żywy");
        }
        else Log.info("Status: strzaskany");
    }

    private void Honor() throws Exception {
        Log.info(showShards().get(6).name());
        Log.info("Naczynie: " + showShards().get(6).getVessel());
        if (showShards().get(6).isAlive()) {
            Log.info("Status: żywy");
        }
        else Log.info("Status: strzaskany");
    }

    private void Odium() throws Exception {
        Log.info(showShards().get(7).name());
        Log.info("Naczynie: " + showShards().get(7).getVessel());
        if (showShards().get(7).isAlive()) {
            Log.info("Status: żywy");
        }
        else Log.info("Status: strzaskany");
    }

    private void Zachowanie() throws Exception {
        Log.info(showShards().get(8).name());
        Log.info("Naczynie: " + showShards().get(8).getVessel());
        if (showShards().get(8).isAlive()) {
            Log.info("Status: żywy");
        }
        else Log.info("Status: strzaskany");
    }

    private void Zniszczenie() throws Exception {
        Log.info(showShards().get(9).name());
        Log.info("Naczynie: " + showShards().get(9).getVessel());
        if (showShards().get(9).isAlive()) {
            Log.info("Status: żywy");
        }
        else Log.info("Status: strzaskany");
    }

    private void powrót() throws Exception {
        throw new Exception("Koniec podróży.");
    }
}
