package Galaxy;

import Galaxy.Planets.Planet;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Scanner;

public class Galaxy {

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
        System.out.println(showPlanets().get(0).name());
    }

    private void stop() throws Exception {
        throw new Exception("Koniec podróży.");
    }
}
