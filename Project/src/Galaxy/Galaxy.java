package Galaxy;

import Galaxy.Planets.Planet;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Scanner;

public final class Galaxy {

    public ArrayList<Planet> showPlanets() {
        ArrayList<Planet> planets = Planet.giveList();
        return planets;
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
        Log.info(showPlanets().get(0).name());
        Log.info("Odprysk: " + showPlanets().get(0).shard());
        Log.info("Systemy magiczne: " + showPlanets().get(0).magic());
    }

    private void Braize() throws Exception {
        Log.info(showPlanets().get(1).name());
        Log.info("Odprysk: " + showPlanets().get(1).shard());
        Log.info("Systemy magiczne: " + showPlanets().get(1).magic());
    }

    private void FirstoftheSun() throws Exception {
        Log.info(showPlanets().get(2).name());
        Log.info("Odprysk: " + showPlanets().get(2).shard());
        Log.info("Systemy magiczne: " + showPlanets().get(2).magic());
    }

    private void Nalthis() throws Exception {
        Log.info(showPlanets().get(3).name());
        Log.info("Odprysk: " + showPlanets().get(3).shard());
        Log.info("Systemy magiczne: " + showPlanets().get(3).magic());
    }

    private void Roshar() throws Exception {
        Log.info(showPlanets().get(4).name());
        Log.info("Odprysk: " + showPlanets().get(4).shard());
        Log.info("Systemy magiczne: " + showPlanets().get(4).magic());
    }

    private void Scadrial() throws Exception {
        Log.info(showPlanets().get(5).name());
        Log.info("Odprysk: " + showPlanets().get(5).shard());
        Log.info("Systemy magiczne: " + showPlanets().get(5).magic());
    }

    private void Sel() throws Exception {
        Log.info(showPlanets().get(6).name());
        Log.info("Odprysk: " + showPlanets().get(6).shard());
        Log.info("Systemy magiczne: " + showPlanets().get(6).magic());
    }

    private void Taldain() throws Exception {
        Log.info(showPlanets().get(7).name());
        Log.info("Odprysk: " + showPlanets().get(7).shard());
        Log.info("Systemy magiczne: " + showPlanets().get(7).magic());
    }

    private void Threnody() throws Exception {
        Log.info(showPlanets().get(8).name());
        Log.info("Odprysk: " + showPlanets().get(8).shard());
        Log.info("Systemy magiczne: " + showPlanets().get(8).magic());
    }

    private void stop() throws Exception {
        throw new Exception("Koniec podróży.");
    }
}
