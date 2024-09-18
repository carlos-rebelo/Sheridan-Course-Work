package coolarraylistwithgenricscomplete;

public class Start {
    public static void main(String[] args)
    {
        CoolArrayList<Car> list = new CoolArrayList<>();
        System.out.println(list.size());

        list.add(new Car("Blue", "ABC123"));
        System.out.println(list.get(0));
        list.add(new Car("Black", "ABC124"));
        System.out.println(list.get(1));
        list.add(new Car("Yellow", "ABC125"));
        System.out.println(list.get(2));
        System.out.println(list.size());

        list.add(new Car("Grey", "ABC126"));

        System.out.println(list.size());

        System.out.println(list.indexOf(new Car("Yellow", "ABC125")));
        System.out.println(list.indexOf(new Car("Yellow", "ABC999")));

        System.out.println(list.contains(new Car("Yellow", "ABC125")));
        System.out.println(list.contains(new Car("Yellow", "ABC999")));

        CoolArrayList<String> aBunchOfStrings = new CoolArrayList<>();
        aBunchOfStrings.add("Hello");
        aBunchOfStrings.add("World");
        System.out.println(aBunchOfStrings.get(1));

        CoolArrayList<Person> people = new CoolArrayList<>();
        people.add(new Person("Bart", 12));

        System.out.println(people.get(0).getName());

    }
}
