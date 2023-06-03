package Aquarium;

public class Pike extends Fish implements SwimSpeed{

    public Pike(String name) {
        super(name);
    }

    @Override
    public String toString() {
            return String.format("Pike: %s, Speed: %d", super.toString(), getSwimSpeed());
    }

    @Override
    public int getSwimSpeed() {
        return 40;
    }


}
