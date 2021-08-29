package Domaci.Nedelja5.Nedelja;

public class WaterPokemon extends Pokemon {

    public WaterPokemon(String name, int health) {
        super(name, health);
    }

    public WaterPokemon(String name,int health, String type){
        super(name,health,type);
    }

    @Override
    public String attack() {
        return "Water";
    }

    @Override
    public String defend() {
        return "Avoids!";
    }

    @Override
    public String wins() {
        return "Fire type";
    }

    @Override
    public String loses() {
        return "Grass type";
    }

    @Override
    public String logAll() {
        return "Attacks with: " + attack() + "\n" +
                "Defends with: " + defend() + "\n" +
                "Wins against: " + wins() + "\n" +
                "Loses against: " + loses() + "\n";
    }
}