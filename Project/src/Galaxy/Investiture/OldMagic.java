package Galaxy.Investiture;

import Galaxy.Interfaces.MagicInterface;
import Galaxy.Log;

public class OldMagic extends Investiture implements MagicInterface {

    public String name() {return "Stara Magia";}

    public void info() {
        String[] info = {
                "Jeden z typów Napełnienia na Rosharze.",
                "Tajemnicza moc pochodząca od magicznej istoty znanej jako Strażniczka Nocy."
        };

        for(String line : info) {
            Log.info(line);
        }
    }

}
