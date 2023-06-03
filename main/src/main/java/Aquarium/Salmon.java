package Aquarium;

public class Salmon extends Fish implements SwimSpeed{

    public Salmon(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return String.format("Salmon: %s, Speed: %d", super.toString(), getSwimSpeed());
    }

    @Override
    public String sound() {
        return "aaaa";
    }

    @Override
    public String feed() {
        return "insects";
    }

    @Override
    public int getSwimSpeed() {
        return 50;
    }
}
