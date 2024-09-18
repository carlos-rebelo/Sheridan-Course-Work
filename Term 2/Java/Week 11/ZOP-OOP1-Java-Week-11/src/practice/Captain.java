package practice;

public class Captain extends Pirate{
    private Sword sword;
    public Captain(String name, int numEyePatches) {
        super(name, numEyePatches);
        
    }

    public void drawSword() throws Exception {
        if (sword == null) {
            throw new Exception("No sword chosen");
        }
        String swordString = ""+sword;
        System.out.println(name+" draws his " + swordString.toLowerCase());
    }

    public void chooseSword(Sword sword) {
        this.sword = sword;
    }

    @Override
    public void speak(String sentence) {
        System.out.println("Arrr, "+sentence+", land hooooo");
    }

    public Sword getSword() {
        return sword;
    }

    @Override
    public String toString() {
        return "Captain [name=" + name + ", sword=" + sword + ", numEyePatches=" + numEyePatches + "]";
    }

}
