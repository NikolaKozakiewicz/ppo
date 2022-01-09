package Galaxy.Investiture;

import Galaxy.Interfaces.MagicInterface;
import Galaxy.Log;

public class AonDor extends Investiture implements MagicInterface {

    public String name() {return "AonDor";}

    public void info() {
        String[] info = {
                "Jeden z wielu różnych typów Napełnienia na Sel,",
                "powiązany z odpryskiem Oddaniem i pisem runicznym zwanym Aonami."
        };

        for(String line : info) {
            Log.info(line);
        }
    }

}
