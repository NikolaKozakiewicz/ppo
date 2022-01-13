package Galaxy.Investiture;

import Galaxy.Interfaces.MagicInterface;
import Galaxy.Log;

public class DiseaseMagic extends Investiture implements MagicInterface {

    public String name() {return "Magia chorób";}

    public void info() {
        String[] info = {
                "Podstawowa forma Napełnienia na Ashyn.",
                "Polega na odtrzymywaniu mocy magicznych podczas chorowania."
        };

        for(String line : info) {
            Log.info(line);
        }
    }

}
