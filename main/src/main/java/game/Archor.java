package game;

public class Archor extends Warrior<Ranged, RangedShields>{
    public Archor(String name, int healthPoint, Ranged weapon, RangedShields shields) {
        super(name, healthPoint, weapon, shields);
    }
    public int  distance(){
        return super.getWeapon().distance();
    }

    @Override
    public String toString() {
        return String.format("Archor: %s, Distance: %d", super.toString(), distance());
    }
}
