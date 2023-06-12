package game;

public class Shield1 implements RangedShields{
    @Override
    public int distance() {
        return 50;
    }

    @Override
    public int demage() {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("Shield1: %d ", distance());
    }

    @Override
    public int protection() {
        return 5;
    }
}
