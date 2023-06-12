package game;

public class CrossBow implements  Ranged{
    @Override
    public int distance() {
        return 100;
    }

    @Override
    public int demage() {
        return 10;
    }
    @Override
    public String toString() {
        return String.format("CrossBow: %d ", demage());
    }
}
