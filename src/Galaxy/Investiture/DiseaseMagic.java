package Galaxy.Investiture;

import Galaxy.Interfaces.MagicInterface;
import Galaxy.Log;

public class DiseaseMagic extends Investiture implements MagicInterface {

    public String name() {return "Magia chorób";}

    public String info() {
                return "Podstawowa forma Napełnienia na Ashyn." +
                        "\nPolega na odtrzymywaniu mocy magicznych podczas chorowania.";
    }

}
