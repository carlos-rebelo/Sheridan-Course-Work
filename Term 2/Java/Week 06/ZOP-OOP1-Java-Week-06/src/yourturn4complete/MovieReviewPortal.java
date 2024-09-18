package yourturn4complete;

public class MovieReviewPortal {
    private MovieReview[] reviews = new MovieReview[15];
    private int numMovieReviews;

    public void addMovieReview(MovieReview review) throws Exception
    {
        if (numMovieReviews == reviews.length)
        {
            throw new Exception("Stack Overflow");
        }
        reviews[numMovieReviews] = review;
        numMovieReviews++;
    }

    public void printAllReviews()
    {
        System.out.println("Reviews");
        for (int floor = 0; floor < numMovieReviews; floor++)
        {
            System.out.println(reviews[floor].getTitle() + " -- " + reviews[floor].getGenre() + " -- " + reviews[floor].getRating());
        }
    }

    public String getMovieNamesBasedOnRating(int rating)
    {
        String returnValue = "Movies with a rating of " + rating + " or more\n";
        for (int floor = 0; floor < numMovieReviews; floor++)
        {
            if (reviews[floor].getRating() >= rating)
            {
                returnValue += reviews[floor].getTitle() + "\n";
            }
        }
        return returnValue;
    }

}
