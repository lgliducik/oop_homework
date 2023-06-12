package game;

public class Battle<W1 extends Weapon, W2 extends Weapon, S1 extends Shield, S2 extends Shield> {
    private Warrior<W1, S1> w1;

    private Warrior<W2, S2> w2;
    public Battle(Warrior w1, Warrior w2) {
        this.w1 = w1;
        this.w2 = w2;
    }
    public void fight(){
        while(w1.getHealthPoint() > 0 && w2.getHealthPoint() > 0 ){
            int demage1 = w1.hit();
            System.out.println("first hit second: " + demage1);
            w2.reduceHealth(demage1);
            int demage2 = w2.hit();
            System.out.println("first hit second: " + demage2);
            w1.reduceHealth(demage2);
            System.out.println(w1);
            System.out.println(w2);

        }
    }
}
