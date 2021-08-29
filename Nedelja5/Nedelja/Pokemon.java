package Domaci.Nedelja5.Nedelja;

public abstract class Pokemon implements Attackable {
    String name, type;
    int health;

    public Pokemon(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public Pokemon(String name, int health,String type) {
        this.name = name;
        this.health = health;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public abstract String logAll();
}