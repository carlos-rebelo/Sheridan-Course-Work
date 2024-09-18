public abstract class Person {
    protected String name;
    protected String favouriteTravelLocation;

    public Person(String name, String location) {
        this.name = name;
        this.favouriteTravelLocation = location;
    }

    public String getName() {
        return name;
    }

    public String getFavouriteTravelLocation() {
        return favouriteTravelLocation;
    }

    public void eat(String food) {
        System.out.println(name+" is eating "+food);
    }

    public abstract void doWork();
}
