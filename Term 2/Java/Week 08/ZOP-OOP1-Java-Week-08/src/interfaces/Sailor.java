package interfaces;

public abstract class Sailor {
    protected String name;

    public Sailor(String name) {
        this.name =name;
    }

    public void battenHatch() {
        System.out.println(name+" is battening then hatch");
    }

    public abstract void eatCereal();
}
