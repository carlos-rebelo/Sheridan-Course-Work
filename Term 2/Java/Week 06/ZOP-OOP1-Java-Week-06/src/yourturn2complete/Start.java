package yourturn2complete;

public class Start {
    public static void main(String[] args)
    {

        // ⁡⁣⁢⁢Part A⁡: 
        //Look at the UML diagram in PargA.jpg - Build this code so that the following code works perfectly

        MovieTicket ticket1 = new MovieTicket("SpiderMan", TicketType.ADULT, 4);
        String ticketInfo = ticket1.getTicketInfo();
        System.out.println(ticketInfo);

        MovieTicket ticket2 = new MovieTicket("Avengers", TicketType.CHILD, 3);
        String ticket2Info = ticket2.getTicketInfo();
        System.out.println(ticket2Info);

        MovieTicket ticket3 = new MovieTicket("Avengers", TicketType.SENIOR, 3);
        String ticket3Info = ticket3.getTicketInfo();
        System.out.println(ticket3Info);

        // ⁡⁣⁢⁢Part B:⁡
        System.out.println("PART B");
        //Make an Array of three MovieTicket objects and print out the movie name and price of ticket for each one

        MovieTicket[] tickets = { ticket1, ticket2, ticket3 };
        for (MovieTicket movieTicket : tickets)
        {
            System.out.println(movieTicket.getMovieName() + " - " + movieTicket.getType().getTicketPrice());
        }

        // ⁡⁣⁢⁢Part C:⁡  For SuperSmartyPants!   
        //create a class called TicketTracker that will keep a record of every ticket sold and will perform various operations as shown by the code below.  Your job is to make the code below work correctly to give you this output:   Ticket Type: ADULT:  Star Wars, Harry Potter: Philosopher's Stone, Star Wars, Top Gun , 

        TicketTracker tracker = new TicketTracker();
        tracker.addMovieTicket(new MovieTicket("Star Wars", TicketType.ADULT, 6));
        tracker.addMovieTicket(new MovieTicket("Harry Potter: Philosopher's Stone", TicketType.CHILD, 3));
        tracker.addMovieTicket(new MovieTicket("Harry Potter: Philosopher's Stone", TicketType.ADULT, 3));
        tracker.addMovieTicket(new MovieTicket("Star Wars", TicketType.ADULT, 6));
        tracker.addMovieTicket(new MovieTicket("Star Wars", TicketType.CHILD, 6));
        tracker.addMovieTicket(new MovieTicket("Top Gun ", TicketType.ADULT, 3));

        System.out.println(tracker.listAllTicketsByType(TicketType.ADULT));

    }
}
