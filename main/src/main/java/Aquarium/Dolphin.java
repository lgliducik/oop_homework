package Aquarium;

public class Dolphin extends Сetaceans implements SwimSpeed{
    public Dolphin(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return String.format("Dolphin: %s, Speed: %d", super.toString(), getSwimSpeed());
    }

    @Override
    public String feed() {
        return "fish";
    }

    @Override
    public String sound() {
        return "yui";
    }
    @Override
    public int getSwimSpeed() {
        return 30;
    }
}
