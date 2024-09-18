package coolarraylist;

public class Start {
    public static void main(String[] args)
    {

        //Let's make our own CoolArrayList that will work with the code below.  Don't forget to implement CoolCarArrayListInterface in CoolArrayList
        CoolArrayList list = new CoolArrayList();
        System.out.println(list.size());

        list.add(new Car("Blue", "ABC123"));
        System.out.println(list.get(0));
        list.add(new Car("Black", "ABC124"));
        System.out.println(list.get(1));
        list.add(new Car("Yellow", "ABC125"));
        System.out.println(list.get(2));
        System.out.println(list.size());

        list.add(new Car("Grey", "ABC126"));
        System.out.println(list.get(3));
        System.out.println(list.size());

        System.out.println(list.indexOf(new Car("Yellow", "ABC125")));
        System.out.println(list.indexOf(new Car("Yellow", "ABC999")));

        System.out.println(list.contains(new Car("Yellow", "ABC125")));
        System.out.println(list.contains(new Car("Yellow", "ABC999")));
    }
}
