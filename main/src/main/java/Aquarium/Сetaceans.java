package Aquarium;

public abstract class Сetaceans extends Animal{
    public Сetaceans(String name) {
        super(name);
    }

    @Override
    public String feed() {
        return "meat";
    }

    @Override
    public String sound() {
        return "mya";
    }
}
