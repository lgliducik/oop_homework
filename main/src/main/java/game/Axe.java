package game;

public class Axe implements  Melee{
    @Override
    public int demage() {
        return 5;
    }
    @Override
    public String toString() {
        return String.format("Axe: %d ", demage());
    }
}
