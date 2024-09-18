package starthere;

import java.util.ArrayList;

public class Submarine {
    ArrayList<Torpedo> torpedos = new ArrayList<>();

    public void loadTorpedo(Torpedo torpedo) {
        torpedos.add(torpedo);
    }

    public void fireAllTorpedos() {
        for (Torpedo torpedo : torpedos) {
            torpedo.fire();
            
        }
        torpedos.clear();
    }
}
