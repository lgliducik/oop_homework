package game;

public class Main {
    public static void main(String[] args) {
        Team<Warrior> team = new Team<>();
        team.add(new Archor("Robin", 100, new Bow(), new Shield1()));
        team.add(new Infantryman("Jon", 150, new Axe(), new Shield1()));
        System.out.format("Weakest shield in team: %d\n", team.getWeakestShield());

        Team<Archor> teamArchor = new Team<>();
        teamArchor.add(new Archor("Jimmy", 100, new CrossBow(), new Shield1()));
        teamArchor.add(new Archor("Piter", 100, new Bow(), new Shield1()));
        System.out.format("Weakest shield in teamArchor: %d\n", teamArchor.getWeakestShield());

        Team<Infantryman> infantrymenArchor = new Team<>();
        infantrymenArchor.add(new Infantryman("Djames", 150, new Sword(), new Shield1()));
        System.out.format("Weakest shield in infantrymenArchor: %d\n", infantrymenArchor.getWeakestShield());

        System.out.println(team);
        System.out.println("-------------");
        System.out.println(teamArchor);
        System.out.println("-------------");
        System.out.println(infantrymenArchor);

        Battle<Axe, Bow, Shield1, Shield1> battle = new Battle<>(new Infantryman("Djames", 150, new Sword(), new Shield1()), new Archor("Jimmy", 100, new CrossBow(), new Shield1()));
        battle.fight();
    }
}
