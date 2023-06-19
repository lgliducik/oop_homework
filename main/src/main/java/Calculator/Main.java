package Calculator;

public class Main {
    public static void main(String[] args) {
        ViewCalculator view = new ViewCalculator(new Log());
        view.run();
    }
}
