package Galaxy.Investiture;

import Galaxy.Interfaces.MagicInterface;

import java.util.ArrayList;

public abstract class Investiture implements MagicInterface {

    public abstract String name();

    public static ArrayList<Investiture> makeMagic() {
        ArrayList<Investiture> magic = new ArrayList<>();

        magic.add(new Allomancy());
        magic.add(new AonDor());
        magic.add(new Aviar());
        magic.add(new Awakening());
        magic.add(new Bloodsealing());
        magic.add(new ChayShan());
        magic.add(new DiseaseMagic());
        magic.add(new Feruchemy());
        magic.add(new Hemalurgy());
        magic.add(new OldMagic());
        magic.add(new SandMastery());
        magic.add(new Shadows());
        magic.add(new Surgebinding());
        magic.add(new Voidbinding());

        return magic;
    }
}
