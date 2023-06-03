package Aquarium;

public class Main {

    public static void main(String[] args) {
        Animal dolphin = new Dolphin("Sonya");
        Animal seal = new Seal("Sofa");

        Aquarium aquarium = new Aquarium();
        aquarium.addAnimal(dolphin).addAnimal(seal).addAnimal(new Pike("sasha")).addAnimal(new Salmon("petr"));
        System.out.println(aquarium.getSound());
    }


}
