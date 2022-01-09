package Galaxy;

public final class Galaxy {

    public void giveShards() {
        FindShard findShard = new FindShard();
        findShard.knowShard();
    }

    public void explorePlenets() {
        ExplorePlanets explorePlanets = new ExplorePlanets();
        explorePlanets.explore();
    }

    public void exploreMagic() {
        ExploreMagic exploreMagic = new ExploreMagic();
        exploreMagic.explore();
    }
}
