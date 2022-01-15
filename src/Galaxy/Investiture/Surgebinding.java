package Galaxy.Investiture;

import Galaxy.Interfaces.MagicInterface;
import Galaxy.Log;

public class Surgebinding extends Investiture implements MagicInterface {

    public String name() {return "Wiązanie Mocy";}

    public String info() {
                return "Jedna z podtawowych form Napełnienia na Rosharze." +
                        "\nObjawia się poprzez więź człowieka z magiczną istotą zwaną sprenem.";
    }

}
