package game;

public class Infantryman extends Warrior{
    public Infantryman(String name, int healthPoint, Melee weapon, Shield1 shield) {
        super(name, healthPoint, weapon, shield);
    }
    @Override
    public String toString() {
        return String.format("Infantryman: %s", super.toString());
    }
}
