package game;

public class Bow implements Ranged{
    @Override
    public int distance() {
        return 50;
    }

    @Override
    public int demage() {
        return 8;
    }

    @Override
    public String toString() {
        return String.format("Bow: %d ", demage());
    }
}
