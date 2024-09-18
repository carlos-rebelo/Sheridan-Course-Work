package yourturn4complete;

public class Start {
    public static void main(String[] args) throws Exception
    {
        MovieReviewPortal portal = new MovieReviewPortal();
        portal.addMovieReview(new MovieReview("Star Wars", Genre.SCIFI, 4));
        portal.addMovieReview(new MovieReview("Intersteller", Genre.SCIFI, 1));
        portal.addMovieReview(new MovieReview("Java Wars", Genre.EDUCATION, 3));

        portal.printAllReviews();
        System.out.println(portal.getMovieNamesBasedOnRating(4));
    }

}
