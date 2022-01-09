package Galaxy.Investiture;

import Galaxy.Interfaces.MagicInterface;
import Galaxy.Log;

public class Hemalurgy extends Investiture implements MagicInterface {

    public String name() {return "Hemalurgia";}

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
