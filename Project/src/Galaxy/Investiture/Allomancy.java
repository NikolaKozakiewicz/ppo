package Galaxy.Investiture;

import Galaxy.Interfaces.MagicInterface;
import Galaxy.Log;

public class Allomancy extends Investiture implements MagicInterface {

    public void info() {
        String[] info = {
                "Allomancja – jeden z trzech typów Napełnienia na Scadrialu",
                "lokalny znana jako jedna z trzech Sztuk Metalicznych."
        };

        for(String line : info) {
            Log.info(line);
        }
    }

    public String name() {return "Allomancja";}

}
