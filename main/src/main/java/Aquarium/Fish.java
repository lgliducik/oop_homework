package Aquarium;

public class Fish extends Animal{

    public Fish(String name) {
        super(name);
    }


    @Override
    public String sound() {
        return "oooo";
    }

    @Override
    public String feed() {
        return "fish";
    }
}
