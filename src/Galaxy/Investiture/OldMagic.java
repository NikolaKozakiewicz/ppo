package Galaxy.Investiture;

import Galaxy.Interfaces.MagicInterface;
import Galaxy.Log;

public class OldMagic extends Investiture implements MagicInterface {

    public String name() {return "Stara Magia";}

    public String info() {
                return "Jeden z typów Napełnienia na Rosharze." +
                        "\nTajemnicza moc pochodząca od magicznej istoty znanej jako Strażniczka Nocy.";
    }

}
