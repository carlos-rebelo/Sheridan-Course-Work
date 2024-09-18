public class Customs {
    private static int travellerId;
    public void processTraveler(HasPassport traveller) {
        System.out.println("Traveller #"+travellerId+": "+traveller.talkToCustoms());
        travellerId += 1;
    }
}
