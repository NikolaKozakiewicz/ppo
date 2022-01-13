package Galaxy;

import java.util.ArrayList;

public class Souvenirs {

    private ArrayList<String> souvenirs = new ArrayList<>();

    public void addEntry(String souvenir) {
        souvenirs.add(souvenir);
    }

    int countSouvenirs() {return souvenirs.size();}

    public ArrayList<String> showSouvenirs() {return souvenirs;}
}
