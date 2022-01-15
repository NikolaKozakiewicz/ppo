package Galaxy.Investiture;

import Galaxy.Interfaces.MagicInterface;
import Galaxy.Log;

public class Forgery extends Investiture implements MagicInterface {

    public String name() {return "Fałszerstwo";}

    public String info() {
                return "Jeden z wielu typów Napełnienia na Sel, praktykowany w regionie MaiPon." +
                        "\nPolega na fałszowaniu duszy za pomocą magicznych pieczęci";
    }

}
