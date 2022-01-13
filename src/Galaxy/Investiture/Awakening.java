package Galaxy.Investiture;

import Galaxy.Interfaces.MagicInterface;
import Galaxy.Log;

public class Awakening extends Investiture implements MagicInterface {

    public String name() {return "Rozbudzanie";}

    public void info() {
        String[] info = {
                "Rodzaj Napełnienia z planety Nalthis",
                "powiązany z Odpryskiem Obdarowaniem i manipulacją BioChromą."
        };

        for(String line : info) {
            Log.info(line);
        }
    }

}
