package Galaxy.Investiture;

import Galaxy.Interfaces.MagicInterface;
import Galaxy.Log;

public class Voidbinding extends Investiture implements MagicInterface {

    public String name() {return "Wiązanie Pustki";}

    public String info() {
                return "Pochodzące z Braize Napełnienie objawiające się też na Rosharze." +
                        "\nPojawia się jedynie w przypadku więzi człowieka z tzw. pustkosprenem.";
    }

}
