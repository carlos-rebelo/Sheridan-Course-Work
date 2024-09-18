package yourturn2;

public class MovieTicket {
    private String movieName;
    private TicketType type;
    private int theaterNumber;

    public MovieTicket(String movieName, TicketType type, int theaterNumber) {
        this.movieName = movieName;
        this.type = type;
        this.theaterNumber = theaterNumber;
    }

    public String getMovieName() {
        return movieName;
    }
    public TicketType getType() {
        return type;
    }
    public int getTheaterNumber() {
        return theaterNumber;
    }
    public String getTicketInfo() {
        return "Movie Name: "+ movieName +"\nTheater Number: "+ theaterNumber + "\nCost: " + type.getPrice();
    }
}
