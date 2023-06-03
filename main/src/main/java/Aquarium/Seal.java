package Aquarium;


public class Seal extends Predatory implements SwimSpeed {
    public Seal(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "pi";
    }

    @Override
    public String toString() {
        return String.format("Bear: %s, Speed: %d", super.toString(), getSwimSpeed());
    }

    @Override
    public int getSwimSpeed() {
        return 50;
    }
}
