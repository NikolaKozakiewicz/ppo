package Galaxy.Investiture;

import Galaxy.Interfaces.MagicInterface;
import Galaxy.Log;

public class Bloodsealing extends Investiture implements MagicInterface {

    public String name() {return "Pieczecie Krwi";}

    public String info() {
                return "Jeden z wielu typów napełnienia na Sel," +
                        "\npolega na pokryciu magicznych pieczęci krwią by więzić człowieka.";
    }

}
