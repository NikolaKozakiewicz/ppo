package Galaxy.Investiture;

import Galaxy.Interfaces.MagicInterface;
import Galaxy.Log;

public class Surgebinding extends Investiture implements MagicInterface {

    public String name() {return "Wiązanie Mocy";}

    public void info() {
        String[] info = {
                "Jedna z podtawowych form Napełnienia na Rosharze",
                "Objawia się poprzez więź człowieka z magiczną istotą zwaną sprenem."
        };

        for(String line : info) {
            Log.info(line);
        }
    }

}
