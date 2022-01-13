package Galaxy;

import Galaxy.MagicUsers.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Duel {

    public ArrayList<MagicUser> giveMagicUsers() {
        ArrayList<MagicUser> participants = new ArrayList<>();
        participants.add(new Bloodsealer("Pieczętujący Krwią"));
        participants.add(new Dakhor("Mnich Dakhoru"));
        participants.add(new Dustbringer("Pyłowiec"));
        participants.add(new Elantrian("Elantryjczyk"));
        participants.add(new Feruchemist("Feruchemik"));
        participants.add(new Forger("Fałszerz"));
        participants.add(new Mistborn("Zrodzony z mgły"));
        participants.add(new Skybreaker("Niebiański"));
        participants.add(new Stoneward("Strażnik Kamienia"));
        participants.add(new Windrunner("Wiatrowy"));

        return participants;
    }

    public ArrayList<MagicUser> makeList(int number) {
        ArrayList<MagicUser> duellers = new ArrayList<>();
        Random rand = new Random();
        for (int i=0; i<number; i++) {
            int power = rand.nextInt(giveMagicUsers().size());
            duellers.add(giveMagicUsers().get(power));
        }

        return duellers;
    }

    public void explore() {
        Scanner scanner = new Scanner(System.in);

        try {
            while (true) {
                String duel = scanner.nextLine();
                this.findDuel(duel);
            }
        } catch (Throwable exception) {
            System.out.println(exception.getMessage());
        }
    }

    private void findDuel(String planet) throws Throwable {
        try {
            Method reflectedMethod = this.getClass().getDeclaredMethod(planet);
            reflectedMethod.setAccessible(true);
            reflectedMethod.invoke(this);
        } catch (NoSuchMethodException | IllegalAccessException e) {
            Log.info(Log.ANSI_RED + "Komenda nieznana." + Log.ANSI_RESET);
        } catch (InvocationTargetException e) {
            throw new Exception(e.getTargetException().getMessage());
        }
    }
}
