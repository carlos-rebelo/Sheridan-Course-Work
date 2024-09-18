package yourturn4;

public class Start {
    public static void main(String[] args) throws Exception
    {

        //Write MovieReviewPortal so the the code below yields the following output:

        //Reviews:
        // Star Wars -- SCIFI -- 4
        // Intersteller -- SCIFI -- 1
        // Java Wars -- EDUCATION -- 3

        // Movies with a rating of 4 or more
        // Star Wars

        MovieReviewPortal portal = new MovieReviewPortal();
        portal.addMovieReview(new MovieReview("Star Wars", Genre.SCIFI, 4));
        portal.addMovieReview(new MovieReview("Intersteller", Genre.SCIFI, 1));
        portal.addMovieReview(new MovieReview("Java Wars", Genre.EDUCATION, 3));
        portal.addMovieReview(new MovieReview("Black Panther", Genre.ACTION, 5));

        portal.printAllReviews();
        System.out.println(portal.getMovieNamesBasedOnRating(4));
    }

}
