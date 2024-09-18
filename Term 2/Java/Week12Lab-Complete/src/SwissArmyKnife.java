import java.util.ArrayList;

public class SwissArmyKnife {
    private ArrayList<Blade> blades = new ArrayList<>();

    public void addBlade(Blade blade) {
        blades.add(blade);
    }
    public void chooseBlade (int num) throws Exception{
        if (num > blades.size()) {
            throw new Exception("No such blade");
        }
        blades.get(num-1).use();
        
    }
}
