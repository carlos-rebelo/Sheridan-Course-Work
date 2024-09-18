public class Plumber extends Person implements HasPassport{

    public Plumber(String name, String location) {
        super(name, location);
    }

    @Override
    public void doWork() {
        System.out.println(name+" is fixing a sink");
    }

    @Override
    public String talkToCustoms() {
        return name+" is travelling to "+favouriteTravelLocation+" by plane";
    }

}
