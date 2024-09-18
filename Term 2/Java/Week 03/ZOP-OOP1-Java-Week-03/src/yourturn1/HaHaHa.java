package yourturn1;


public class HaHaHa {
    public static void main(String[] args) {
        JokeMachine joke = new JokeMachine();
        String newman = joke.getWorldsFunniestJoke();
        System.out.println(newman);
        System.out.println(joke.getMultipleRandomJokes(5));
        System.out.println(joke.howManyRandomJokesAreThere());
    }
}
