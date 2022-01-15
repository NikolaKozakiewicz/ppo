package Galaxy.Investiture;

import Galaxy.Interfaces.MagicInterface;
import Galaxy.Log;

public class SandMastery extends Investiture implements MagicInterface {

    public String name() {return "Mistrzostwo piasku";}

    public String info() {
                return "Podstawowy typ napełnienia na Taldainie." +
                        "\nPolega na manipulowaniu piaskiem wykorzytując wodę z własnego ciała.";
    }

}
