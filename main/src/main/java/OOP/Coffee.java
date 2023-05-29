package OOP;

public class Coffee {

    private String name;
    private int temperature;
    private int volume;
    private double price;

    public Coffee(String name, int temperature, int volume, double price) {
        this.name = name;
        this.temperature = temperature;
        this.volume = volume;
        this.price = price;
    }

    @Override
    public String toString() {
        return  String.format("Какой вид кофе: %s, Температура: %d, Обьем: %d, Цена: %f",
                name, temperature, volume, price);
    }

    public String getProductName() {
        return name;
    }

    public double getProductPrice() {
        return price;
    }
}
