package Galaxy.Investiture;

import Galaxy.Interfaces.MagicInterface;
import Galaxy.Log;

public class Allomancy extends Investiture implements MagicInterface {

    public String name() {
        return "Allomancja";
    }

    public String info() {
        return "Jeden z trzech typów Napełnienia na Scadrialu " +
                "\nlokalny znana jako jedna z trzech Sztuk Metalicznych.";
    }

}
