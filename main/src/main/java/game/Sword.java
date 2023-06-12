package game;

public class Sword implements Melee
{
    @Override
    public int demage() {
        return 0;
    }
    @Override
    public String toString() {
        return String.format("Sword: %d ", demage());
    }
}
