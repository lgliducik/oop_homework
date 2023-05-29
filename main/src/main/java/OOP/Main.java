package OOP;

import java.util.ArrayList;
import java.util.List;

//Создать торговый кофейный автомат, напитки в автомате должны содержать следующие данные:
//наименование, объем, температура, цена.
//Проинициализировать несколько напитков в классе main и торговый автомат,
//воспроизвести логику продажи напитков.

public class Main {
    public static void main(String[] args) {

        CoffeeMachine apparat = new CoffeeMachine();
        apparat.addProduct(new Latte("латте", 90, 50,150))
                .addProduct(new Coffee("американо", 30, 100, 110))
                .addProduct(new Capuchino("капучино", 80, 100, 200, 200));

        System.out.println(apparat);
        Coffee product = apparat.findCoffee("американо");
        System.out.println(product);

        System.out.println("+++++++++++++++++++++");
        Coffee saledProduct = apparat.saleProduct("латте");
        System.out.println(saledProduct);
        Coffee saledProduct2 = apparat.saleProduct("капучино");
        System.out.println(saledProduct2);
        System.out.println(apparat);
    }
}
