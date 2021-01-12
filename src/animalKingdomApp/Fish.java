package animalKingdomApp;

public class Fish extends Animals {
    public Fish(String name, int yearDiscovered) {
        super(name, yearDiscovered, "fish");
    }

    @Override
    public String move () {
        return "swim";
    }

    @Override
    public String breath () {
        return "gills";
    }

    @Override
    public String reproduce () {
        return "eggs";
    }
}
