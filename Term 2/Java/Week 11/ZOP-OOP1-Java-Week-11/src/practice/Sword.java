package practice;

public enum Sword {
    BROADSWORD(25), LONGSWORD(35), DAGGER(15), SCIMATAR(30);
    private int length;

    private Sword(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }
}
