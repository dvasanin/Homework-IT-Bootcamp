package Domaci.Nedelja5.Nedelja;

public class GrassPokemon extends Pokemon {

    public GrassPokemon(String name, int health) {
        super(name, health);
    }

    public GrassPokemon(String name,int health, String type){
        super(name,health,type);
    }

    @Override
    public String attack() {
        return "Grass";
    }

    @Override
    public String defend() {
        return "Dodges!";
    }

    @Override
    public String wins() {
        return "Water";
    }

    @Override
    public String loses() {
        return "Fire";
    }

    @Override
    public String logAll() {
        return "Attacks with: " + attack() + "\n" +
                "Defends with: " + defend() + "\n" +
                "Wins against: " + wins() + "\n" +
                "Loses against: " + loses() + "\n";
    }
}