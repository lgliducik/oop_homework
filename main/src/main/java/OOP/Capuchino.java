package OOP;

public class Capuchino extends Coffee{
    private int milkFoamVolume;
    public Capuchino(String name, int temperature, int volume, double price, int milkFoamVolume) {
        super(name, temperature, volume, price);
        this.milkFoamVolume = milkFoamVolume;
    }

    @Override
    public String toString() {
        return String.format("Латте: %s, Молочная пена: %d", super.toString(), milkFoamVolume);
    }
}
