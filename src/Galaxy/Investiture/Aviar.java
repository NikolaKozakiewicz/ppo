package Galaxy.Investiture;

import Galaxy.Interfaces.MagicInterface;
import Galaxy.Log;

public class Aviar extends Investiture implements MagicInterface {

    public String name() {
        return "Aviary";
    }

    public String info() {
        return "Gatunek magicznych ptaków podobnych do papug z Pierwszej od Słońca." +
                "\nWykazują się niezwykłą inteligencją i zdolność wykrywania magii.";

    }

}
