package yourturn2complete;

import java.util.ArrayList;
import java.util.Random;

public class SeeAndSay {
    private ArrayList<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal)
    {
        animals.add(animal);
    }

    public void pullString()
    {
        Random rnd = new Random();
        Animal randomAnimalFromList = animals.get(rnd.nextInt(animals.size()));
        System.out.println("The " + randomAnimalFromList.getAnimalType() + " says " + randomAnimalFromList.makeNoise());
    }

}
