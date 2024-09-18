package practice;

import java.util.ArrayList;
import java.util.Random;
public class Start {
    public static void main(String[] args) throws Exception {
        
        /* ArrayList<Pirate> pirates = new ArrayList<>();
        pirates.add(new Captain("Blackbeard",1));
        pirates.add(new Captain("Davey Jones",2));
        pirates.add(new Pirate("Skully",5));
        pirates.add(new Pirate("Jonesy", 4));
        pirates.add(new Pirate("Jack",5));
        Random r1 = new Random();
        String[] names = {"Carlos", "Justin","Jon","Dustin","Israel","Khabib","Tyron","Alex","Jamahal","Robert"};
        for (int index = 0; index < 10; index++) {
            pirates.add(new Pirate(names[index], r1.nextInt(10)));
        }

        pirates.stream().forEach((p) -> System.out.println(p));

        pirates.stream().forEach((p) -> System.out.println(p.getName()));

        pirates.stream()
        .filter((p) -> p.numEyePatches > 3)
        .forEach((p) -> System.out.println(p));

        long s = pirates.stream()
        .filter((p) -> p.numEyePatches < 3)
        .count();
        System.out.println(s); */

        Pirate p1 = new Captain("Kirk", 2);
        
        ((Captain) p1).chooseSword(Sword.BROADSWORD);

        ((Captain) p1).drawSword();
        p1.speak("Hello");
        System.out.println(p1);

        Captain c1 = new Captain("Carlos", 0);
        c1.chooseSword(Sword.SCIMATAR);
        System.out.println(c1.getName()+"'s sword is "+c1.getSword().getLength()+" inches in length");
        c1.speak("i need water");

        Object o1 = new Pirate("John",2);
        System.out.println(o1.toString());
        

    }
}
