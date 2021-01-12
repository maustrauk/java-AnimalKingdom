package animalKingdomApp;

public class Mammals extends Animals {


    public Mammals(String name, int yearDiscovered) {
        super(name, yearDiscovered, "mammal");
    }

    @Override
    public String move () {
        return "walk";
    }

    @Override
    public String breath () {
        return "lungs";
    }

    @Override
    public String reproduce () {
        return "live births";
    }
}
