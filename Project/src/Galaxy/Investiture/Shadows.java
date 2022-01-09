package Galaxy.Investiture;

import Galaxy.Interfaces.MagicInterface;
import Galaxy.Log;

public class Shadows extends Investiture implements MagicInterface {

    public String name() {return "Cienie";}

    public void info() {
        String[] info = {
                "Główna manifestacja Napełnienia na planecie Tren (Threnody)",
                "Sprawia iż w lasach pojawiają podobne do duchów istoty zwane Cieniami."
        };

        for(String line : info) {
            Log.info(line);
        }
    }

}
