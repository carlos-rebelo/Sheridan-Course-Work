package yourturn4;

public class MovieReviewPortal {
    private MovieReview[] reviews = new MovieReview[15];
    private int numMovieReviews;

    public void addMovieReview(MovieReview review) {
        reviews[numMovieReviews] = review;
        numMovieReviews++;
    }
    public void printAllReviews() {
        System.out.println("Reviews:");
        for(int i = 0; i < numMovieReviews; i++) {
            System.out.println(reviews[i].getTitle()+" -- "+reviews[i].getGenre()+" -- "+reviews[i].getRating());
        }
    }
    public String getMovieNamesBasedOnRating(int rating) {
        System.out.println("Movies with a rating of "+rating+" or more");
        String returnStr = "";
        for(int i = 0; i < numMovieReviews; i++) {
            if (reviews[i].getRating() >= rating) {
                returnStr += reviews[i].getTitle() + " -- ";
            }
        }
        return returnStr;
    }
}
