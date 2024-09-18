package holdingareference;

public class Car {

    private String make;
    private Engine engine;
    private Horn horn;
    /* Hint: Adding an Engine and Horn instance variables
     private Engine engine = new Engine(4);
     private Horn horn = new Horn();
     */

    // Add a Constructor
    public Car(String make, Engine engine, Horn horn) {
        this.make = make;
        this.engine = engine;
        this.horn = horn;
    }

    public String getMake() {
        return this.make;
    }


    public Engine getEngine() {
        return this.engine;
    }


    // public Horn getHorn() {
    //     return this.horn;
    // }

    //honkTheHorn method
    public void honkTheHorn() {
        horn.honk();
    }
    //startTheEngine method
    public void startTheEngine() {
        engine.start();
    }
}
