package Aquarium;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {

    private List<Animal> aquarium = new ArrayList<>();

    public Aquarium addAnimal(Animal someAnimal){
        aquarium.add(someAnimal);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("В аквариуме: ");
        for (Animal animal: aquarium){
            builder.append(animal).append('\n');
        }
        return builder.toString();
    }

    public String getSound(){
        StringBuilder builder = new StringBuilder();
        for (Soundable soundable: getSountable()){
            builder.append(soundable.sound()).append("\n");
        }
        return builder.toString();
    }

    private List<Soundable> getSountable(){
        List<Soundable> result = new ArrayList<>();
        for (Animal animal: aquarium) {
            result.add(animal);
        }
        return result;
    }

}
