package practice;

public class Pirate {
    protected String name;
    protected int numEyePatches;
    
    public Pirate(String name, int numEyePatches) {
        this.name = name;
        this.numEyePatches = numEyePatches;
    }
    public void speak(String sentence) {
        System.out.println("Arrr, "+sentence+", you scurvy dog");
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Pirate [name=" + name + ", numEyePatches=" + numEyePatches + "]";
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumEyePatches() {
        return numEyePatches;
    }

    public void setNumEyePatches(int numEyePatches) {
        this.numEyePatches = numEyePatches;
    }

    
}
