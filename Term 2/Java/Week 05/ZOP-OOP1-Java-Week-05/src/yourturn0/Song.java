package yourturn0;

public class Song {
    private final String title;
    private final String artist;
    private final int numSeconds;

    public Song(String title, String artist, int numSeconds) {
        this.title = title;
        this.artist = artist;
        this.numSeconds = numSeconds;
    }

    public String getTitle()
    {
        return title;
    }

    public String getArtist()
    {
        return artist;
    }

    public int getNumSeconds()
    {
        return numSeconds;
    }

}
