public class Youtuber extends Person{

    public Youtuber(String name, String location) {
        super(name, location);
    }

    @Override
    public void doWork() {
        System.out.println(name+" is making a video");
    }

}
