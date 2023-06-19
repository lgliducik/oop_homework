package Calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class ViewCalculator {
    Logger logger;
    LogCalculator logCalculator;
    public ViewCalculator(Logger logger) {
        this.logger = logger;
        this.logCalculator = new LogCalculator(new Calculator(), logger);
    }
    public void run() {
        while (true) {
            Complex result;
            ArrayList<Complex> pair;
            while (true) {
                String cmd = prompt("Введите команду (*, /, +, -) : ");
                if (cmd.equals("*")) {
                    pair = promtComplexPair();
                    result = logCalculator.multi(pair.get(0), pair.get(1));
                    System.out.printf("Результат %s\n", result);
                    continue;
                }
                if (cmd.equals("/")) {
                    pair = promtComplexPair();
                    result = logCalculator.division(pair.get(0), pair.get(1));
                    System.out.printf("Результат %s\n", result);
                    continue;
                }
                if (cmd.equals("+")) {
                    pair = promtComplexPair();
                    result = logCalculator.sum(pair.get(0), pair.get(1));
                    System.out.printf("Результат %s\n", result);
                    continue;
                }
                if (cmd.equals("-")) {
                    pair = promtComplexPair();
                    result = logCalculator.minus(pair.get(0), pair.get(1));
                    System.out.printf("Результат %s\n", result);
                    continue;
                }
                break;
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }
    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
    private Complex promptIntComplex(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        System.out.print("\nreal part: ");
        String real = in.nextLine();
        System.out.print("image part: ");
        String image = in.nextLine();
        return new Complex(Double.parseDouble(real), Double.parseDouble(image));
    }
    private ArrayList<Complex> promtComplexPair(){
        ArrayList<Complex> pair = new ArrayList<>();
        pair.add(promptIntComplex("Введите первый аргумент: "));
        pair.add(promptIntComplex("Введите второй аргумент: "));
        return pair;
    }
}
