package Galaxy;

import Galaxy.Investiture.Investiture;
import Galaxy.Planets.Planet;
import Galaxy.Shards.Shard;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Scanner;

public class ExplorePlanets {

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
                String planet = scanner.nextLine();
                this.findPlanet(planet);
            }
        } catch (Throwable exception) {
            System.out.println(exception.getMessage());
        }
    }

    private void findPlanet(String planet) throws Throwable {
        try {
            Method reflectedMethod = this.getClass().getDeclaredMethod(planet);
            reflectedMethod.setAccessible(true);
            reflectedMethod.invoke(this);
        } catch (NoSuchMethodException | IllegalAccessException e) {
            Log.info("Brak podanej planety.");
        } catch (InvocationTargetException e) {
            throw new Exception(e.getTargetException().getMessage());
        }
    }

    private void Ashyn() throws Exception {
        show(0);
    }

    private void Braize() throws Exception {
        show(1);
    }

    private void FirstoftheSun() throws Exception {
        show(2);
    }

    private void Nalthis() throws Exception {
        show(3);
    }

    private void Roshar() throws Exception {
        show(4);
    }

    private void Scadrial() throws Exception {
        show(5);
    }

    private void Sel() throws Exception {
        show(6);
    }

    private void Taldain() throws Exception {
        show(7);
    }

    private void Threnody() throws Exception {
        show(8);
    }

    private void powrót() throws Exception {
        throw new Exception("Koniec podróży.");
    }

    private void show(int a) {
        Log.info(showPlanets().get(a).name());
        Log.info("[Odprysk]:");
        for (int i=0; i<showPlanets().get(a).shard().size(); i++) {
            Log.info(showPlanets().get(a).shard().get(i).name());
        }
        Log.info("[Systemy magiczne]:");
        for (int i=0; i<showPlanets().get(a).magic().size(); i++) {
            Log.info(showPlanets().get(a).magic().get(i).name());
        }
        Log.info("[Pojawienia]: " + showPlanets().get(a).book());
    }
}
