package animalKingdomApp;

public abstract class Animals {
    protected static int maxId = 0;
    protected int id;
    protected String name;
    protected int yearDiscovered;
    protected String type;

    protected Animals (
        String name,
        int yearDiscovered,
        String type
    ) {
        maxId++;
        id = maxId;
        this.name = name;
        this.yearDiscovered = yearDiscovered;
        this.type = type;
    }

    public void consumeFood () {

    }

    public String move () {
        return "move";
    }

    public String breath () {
        return "breath";
    }

    public String reproduce () {
        return "reproduce";
    }

    public String contain () {
        return "Item #" + id + " Name: `" + name + "` Year Named: " + yearDiscovered;
    }

    public int getYear () {
        return yearDiscovered;
    }

    public String getName () {
        return name;
    }

    public String getType () {
        return type;
    }
}
