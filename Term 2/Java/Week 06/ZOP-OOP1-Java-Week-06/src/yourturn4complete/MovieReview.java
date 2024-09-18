package yourturn4complete;

public class MovieReview {
    private String title;
    private Genre genre;
    private int rating;

    public MovieReview(String title, Genre genre, int rating) throws Exception {

        if (rating < 0 || rating > 5)
        {
            throw new Exception("Ratings must be 0-5");
        }
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }

    public String getTitle()
    {
        return title;
    }

    public Genre getGenre()
    {
        return genre;
    }

    public int getRating()
    {
        return rating;
    }

}
