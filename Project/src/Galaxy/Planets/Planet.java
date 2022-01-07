package Galaxy.Planets;

import Galaxy.Log;

abstract public class Planet {

    private String name;
    private int x;
    private int y;

    Planet(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return getClass().getSimpleName();
    }
}
