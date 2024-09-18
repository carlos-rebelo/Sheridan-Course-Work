package yourturn2complete;

public class TicketTracker {
    private MovieTicket[] tickets = new MovieTicket[20];
    private int numTickets;

    public void addMovieTicket(MovieTicket ticket)
    {
        tickets[numTickets] = ticket;
        numTickets++;
    }

    public String listAllTicketsByType(TicketType type)
    {
        String results = "Ticket Type: " + type + ":  ";
        for (int i = 0; i < numTickets; i++)
        {
            results += (tickets[i].getType() == type) ? tickets[i].getMovieName() + ", " : "";
        }
        return results;
    }
}
