package OOP;


import java.util.ArrayList;
import java.util.List;

public class CoffeeMachine {
    private List<Coffee> vending = new ArrayList<>();
    private double cash = 0;

    public CoffeeMachine addProduct(Coffee prod){
        vending.add(prod);
        return this;
    }

    public double getCash() {
        return cash;
    }

    public Coffee saleProduct(String nameProd){
        Coffee found = findCoffee(nameProd);
        if (found != null){
            cash = cash + found.getProductPrice();
            vending.remove(found);
        }
        return found;
    }

    public Coffee findCoffee(String name){
        for (Coffee product:vending) {
            if (name.equals(product.getProductName())){
                return product;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Денег в автомате: ").append(cash).append("\n");
        for (Coffee product:vending) {
            builder.append(product).append("\n");
        }
        return builder.toString();
    }
}
