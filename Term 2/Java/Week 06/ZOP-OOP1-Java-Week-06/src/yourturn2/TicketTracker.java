package yourturn2;

public class TicketTracker {
    private MovieTicket[] tickets = new MovieTicket[20];
    private int numTickets;

    public void addMovieTicket(MovieTicket ticket) {
        this.tickets[numTickets] = ticket;
        numTickets++;
    }

    public String listAllTicketsByType(TicketType type) {
        String result = "Movie names of ticket type "+type+": ";
        for (int i = 0; i < numTickets; i++) {
           
            if(tickets[i].getType() == type) {
                result += tickets[i].getMovieName() + ", ";
            }
            else {
                result += "";
            }
        }
        return result;
    }

}
