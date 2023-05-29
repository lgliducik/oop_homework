package OOP;

import OOP.Main;

public class Latte extends OOP.Coffee {
    private double milkVolume;
    public Latte(String name, int temperature, int volume, double price) {
        super(name, temperature, volume, price);
        this.milkVolume = milkVolume;
    }

    @Override
    public String toString() {
        return String.format("Латте: %s, Вес: %f", super.toString(), milkVolume);
    }
}
