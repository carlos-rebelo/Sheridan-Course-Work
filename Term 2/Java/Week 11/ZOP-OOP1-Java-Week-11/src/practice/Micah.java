package practice;

public class Micah extends Enemy implements Gunslinger{
    
    public Micah(String name) {
        super(name);
        
    }

    @Override
    public void shoot() {
        System.out.println(name+" shoots their pistol");
    }

}
