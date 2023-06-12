package game;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team<T extends Warrior> implements Iterable<T> {
    List<T> team = new ArrayList<>();
    public void add(T element){
        team.add(element);
    }

    @Override
    public Iterator<T> iterator(){
        return team.iterator();

    }

    public int getTeamHealth(){
        int teamHealth = 0;
        for (T t: this){
            teamHealth += t.getHealthPoint();
        }
        return teamHealth;
    }
    public int maxAttackDistance(){
        int maxDistance = 0;
        for (T t: this){
            if (!(t instanceof Archor)){
                continue;

            }
            if (maxDistance< ((Archor) t).distance()){
                maxDistance = ((Archor) t).distance();
            }
        }
        return maxDistance;
    }
    public int getTeamAttack(){
        int teamAttact = 0;
        for (T t: this){
            teamAttact += t.getWeapon().demage();
        }
        return teamAttact;
    }

    public int getWeakestShield(){
        int min = 0;
        boolean isFirst = true;
        for (T member: this){
            if (isFirst) {
                min = member.shield.protection();
                isFirst = false;
            } else {
                min = Math.min(min, member.shield.protection());
            }
        }
        return min;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (T t: this){
            builder.append(t).append("\n");
        }
        builder.append(String.format("TeamAttack: %d ", getTeamAttack()));
        builder.append(String.format("TeamAttack: %d ", maxAttackDistance()));
        builder.append(String.format("TeamAttack: %d ", getTeamHealth()));
        return builder.toString();
    }
}
