package Galaxy.Investiture;

import Galaxy.Interfaces.MagicInterface;
import Galaxy.Log;

public class SandMastery extends Investiture implements MagicInterface {

    public String name() {return "Mistrzostwo piasku";}

    public void info() {
        String[] info = {
                "Podstawowy typ napełnienia na Taldainie",
                "Polega na manipulowaniu piaskiem wykorzytując wodę z własnego ciała."
        };

        for(String line : info) {
            Log.info(line);
        }
    }

}
