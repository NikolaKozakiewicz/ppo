package Galaxy.Investiture;

import Galaxy.Interfaces.MagicInterface;
import Galaxy.Log;

public class Allomancy extends Investiture implements MagicInterface {

    public String name() {return "Allomancja";}

    public void info() {
        String[] info = {
                "Jeden z trzech typów Napełnienia na Scadrialu",
                "lokalny znana jako jedna z trzech Sztuk Metalicznych."
        };

        for(String line : info) {
            Log.info(line);
        }
    }

}
