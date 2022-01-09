package Galaxy.Investiture;

import Galaxy.Interfaces.MagicInterface;
import Galaxy.Log;

public class ChayShan extends Investiture implements MagicInterface {

    public String name() {return "ChayShan";}

    public void info() {
        String[] info = {
                "Jeden z wielu typów napełnienia na Sel.",
                "Jest to sztuka walki, której konkretne pozycje zapewniają niezwykłą moc."
        };

        for(String line : info) {
            Log.info(line);
        }
    }

}
