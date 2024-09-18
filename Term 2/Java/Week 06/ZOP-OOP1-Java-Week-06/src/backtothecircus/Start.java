package backtothecircus;

public class Start {
    public static void main(String[] args)
    {
        //lets debug!
        Animal animal1 = new Animal(AnimalType.LION);
        Cage c1 = new Cage(animal1);

        Cage[] cages = new Cage[5];

        System.out.println(c1.getAnimal().getAnimalType());

        System.out.println(cages);
        System.out.println(cages[0]);
        //System.out.println(cages[0].getAnimal().getAnimalType());

        cages[0] = new Cage();
        System.out.println(cages[0]);
        System.out.println(cages[0].getAnimal());
        System.out.println(cages[0].getAnimal().getAnimalType());

        cages[0].setAnimal(new Animal(AnimalType.ELEPHANT));
        System.out.println(cages[0].getAnimal().getAnimalType());
    }
}
