public class Start {
    public static void main(String[] args) throws Exception
    {
        Person [] people = {
            new Nurse("Joanne", "Georgia"),
            new Plumber("John", "Hawaii"),
            new Youtuber("Ken", "Dubai")
        };

        for (Person person : people) {
            person.doWork();
        }
        Customs customs = new Customs();
        Nurse n1 = new Nurse("John", "Ghana");
        Plumber p1 = new Plumber("Shelly", "Ecuador");
        Youtuber y1 = new Youtuber("Jean", "Lagos");
        customs.processTraveler(n1);
        customs.processTraveler(p1);
        /* 
        customs.processTraveler(y1); 
        The reason this line of code would produce an error is that the class Youtuber does not
        implement the HasPassport interface. The type of object being passed through the processTraveler
        method needs to implement this interface to be valid. This is because with polymorphism, objects
        that implement the HasPassport interface can be seen as an object of type HasPassport because they
        implement the same methods. Since the other classes implement this interface, the JVM knows that 
        they will have the required methods, while the classes that dont implement the interface have
        no guarantee that they will implement the required methods.
        */
    }
}
