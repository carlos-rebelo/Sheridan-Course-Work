package pirate;

public class Pirate {
    public String name;


    public void drawSword() {

    }

    public void speak() {
        System.out.println(name + "is speaking");
    }

    public void pirateTalk(String phrase) {
        String startSentence = "Arrrrrr, ";
        String endSentence = ", you scurvy dog!";
        String pirateSpeak = startSentence + phrase + endSentence;
        System.out.println(pirateSpeak);
    }

    public String translateToPirate(String phrase) {
        String startSentence = "Arrrrrr, ";
        String endSentence = ", you scurvy dog!";
        String pirateSpeak = startSentence + phrase + endSentence;
        return pirateSpeak;
    }

    public void shootPistol(int numShots, String soundEffect) {

        for (int i = 0; i < numShots; i++) {
            System.out.println(name+ " shoots pistol, " + soundEffect);
        }

    }
}
