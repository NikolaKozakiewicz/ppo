package Galaxy.Investiture;

import Galaxy.Interfaces.MagicInterface;
import Galaxy.Log;

public class Forgery extends Investiture implements MagicInterface {

    public String name() {return "Fałszerstwo";}

    public void info() {
        String[] info = {
                "Jeden z wielu typów Napełnienia na Sel, praktykowany w regionie MaiPon.",
                "Polega na fałszowaniu duszy za pomocą magicznych pieczęci"
        };

        for(String line : info) {
            Log.info(line);
        }
    }

}
