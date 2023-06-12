package game;

import java.util.Random;

public abstract class Warrior<W extends Weapon, S extends Shield>{  //, S extends Shield>{
    String name;
    int healthPoint;
    W weapon;

    S shield;

    public Warrior(String name, int healthPoint, W weapon, S shield) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
        this.shield = shield;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public void setWeapon(W weapon) {
        this.weapon = weapon;
    }

    public void setShield(S shield) {
        this.shield = shield;
    }
    public S getShield() {
        return shield;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public W getWeapon() {
        return weapon;
    }
    public int hit(){
        Random rnd = new Random();
        int hitDamage = rnd.nextInt(0,weapon.demage() + 1);

        return hitDamage;
    }
    public void reduceHealth(int damage) {
        Random rnd = new Random();
        int protection = rnd.nextInt(0,shield.protection() + 1);
        healthPoint -= (damage - protection);
        if(healthPoint < 0){
            healthPoint = 0;
        }
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Weapon: %s, HealthPoint: %d", name, weapon, healthPoint);
    }
}
