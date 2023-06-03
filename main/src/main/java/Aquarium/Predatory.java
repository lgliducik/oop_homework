package Aquarium;

public abstract class Predatory extends Animal {

    public Predatory(String name) {
        super(name);
    }

    @Override
    public String feed() {
        return "meat";
    }
}
