public class Nurse extends Person implements HasPassport{

    public Nurse(String name, String location) {
        super(name, location);
    }

    @Override
    public void doWork() {
        System.out.println(name+" is checking blood pressure");
    }

    @Override
    public String talkToCustoms() {
        return name + " is travelling to "+favouriteTravelLocation+" by boat";
    }

}
