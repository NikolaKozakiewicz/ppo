package Galaxy;

import Galaxy.Investiture.Investiture;
import Galaxy.Planets.*;
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
            Log.info(Log.ANSI_RED + "Brak podanej planety." + Log.ANSI_RESET);
        } catch (InvocationTargetException e) {
            throw new Exception(e.getTargetException().getMessage());
        }
    }

    private void Ashyn() throws Exception {
        show(0);
        Ashyn ashyn = new Ashyn();
        ashyn.explore();
    }

    private void Braize() throws Exception {
        show(1);
        Braize braize = new Braize();
        braize.explore();
    }

    private void FirstoftheSun() throws Exception {
        show(2);
        FirstoftheSun firstoftheSun = new FirstoftheSun();
        firstoftheSun.explore();
    }

    private void Nalthis() throws Exception {
        show(3);
        Nalthis nalthis = new Nalthis();
        nalthis.explore();
    }

    private void Roshar() throws Exception {
        show(4);
        Roshar roshar = new Roshar();
        roshar.explore();
    }

    private void Scadrial() throws Exception {
        show(5);
        Scadrial scadrial = new Scadrial();
        scadrial.explore();
    }

    private void Sel() throws Exception {
        show(6);
        Sel sel = new Sel();
        sel.explore();
    }

    private void Taldain() throws Exception {
        show(7);
        Taldain taldain = new Taldain();
        taldain.explore();
    }

    private void Threnody() throws Exception {
        show(8);
        Threnody threnody = new Threnody();
        threnody.explore();
    }

    private void powrót() throws Exception {
        throw new Exception(Log.ANSI_GREEN + "Koniec podróży." + Log.ANSI_RESET);
    }

    private void show(int a) {
        Log.info(showPlanets().get(a).name());
        Log.info(Log.ANSI_GREEN + "Odprysk:" + Log.ANSI_RESET);
        for (int i=0; i<showPlanets().get(a).shard().size(); i++) {
            Log.info(Log.ANSI_BLUE + showPlanets().get(a).shard().get(i).name() + Log.ANSI_RESET);
        }
        Log.info(Log.ANSI_GREEN + "Systemy magiczne:" + Log.ANSI_RESET);
        for (int i=0; i<showPlanets().get(a).magic().size(); i++) {
            Log.info(Log.ANSI_BLUE + showPlanets().get(a).magic().get(i).name() + Log.ANSI_RESET);
        }
        Log.info(Log.ANSI_GREEN + "Pojawienia: " + Log.ANSI_RESET + Log.ANSI_BLUE + showPlanets().get(a).book() + Log.ANSI_RESET);
    }
}
