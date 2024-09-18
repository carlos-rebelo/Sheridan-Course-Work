package practice;

public abstract class Player {
    protected String name;
    protected String goldHeld;
    protected int health = 50;

    public Player(String name) {
        this.name = name;
    }

    public void heal() {
        System.out.println(name+" is healing...");
        health += 10;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
