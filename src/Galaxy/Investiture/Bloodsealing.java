package Galaxy.Investiture;

import Galaxy.Interfaces.MagicInterface;
import Galaxy.Log;

public class Bloodsealing extends Investiture implements MagicInterface {

    public String name() {return "Pieczecie Krwi";}

    public void info() {
        String[] info = {
                "Jeden z wielu typów napełnienia na Sel,",
                "polega na pokryciu magicznych pieczęci krwią by więzić człowieka."
        };

        for(String line : info) {
            Log.info(line);
        }
    }

}
