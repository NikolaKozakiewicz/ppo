package Galaxy.Investiture;

import Galaxy.Interfaces.MagicInterface;
import Galaxy.Log;

public class Voidbinding extends Investiture implements MagicInterface {

    public String name() {return "Wiązanie Pustki";}

    public void info() {
        String[] info = {
                "Pochodzące z Braize Napełnienie objawiające się też na Rosharze",
                "Pojawia się jedynie w przypadku więzi człowieka z tzw. pustkosprenem."
        };

        for(String line : info) {
            Log.info(line);
        }
    }

}
