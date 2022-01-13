package Galaxy.Investiture;

import Galaxy.Interfaces.MagicInterface;
import Galaxy.Log;

public class Aviar extends Investiture implements MagicInterface {

    public String name() {return "Aviary";}public void info() {
        String[] info = {
                "Gatunek magicznych ptaków podobnych do papug z Pierwszej od Słońca.",
                "Wykazują się niezwykłą inteligencją i zdolność wykrywania magii."
        };

        for(String line : info) {
            Log.info(line);
        }
    }

}
