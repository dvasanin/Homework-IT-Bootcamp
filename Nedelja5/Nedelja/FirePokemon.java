package Domaci.Nedelja5.Nedelja;

public class FirePokemon extends Pokemon {

    public FirePokemon(String name, int health) {
        super(name, health);
    }

    public FirePokemon(String name,int health, String type){
        super(name,health,type);
    }

    @Override
    public String attack() {
        return "Fire";
    }

    @Override
    public String defend() {
        return "Resisted!";
    }

    @Override
    public String wins() {
        return "Grass type";
    }

    @Override
    public String loses() {
        return "Water type";
    }

    @Override
    public String logAll() {
        return "Attacks with: " + attack() + "\n" +
                "Defends with: " + defend() + "\n" +
                "Wins against: " + wins() + "\n" +
                "Loses against: " + loses() + "\n";
    }
}