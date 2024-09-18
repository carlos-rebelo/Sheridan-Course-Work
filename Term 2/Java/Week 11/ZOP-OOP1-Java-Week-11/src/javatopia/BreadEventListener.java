package javatopia;

@FunctionalInterface //notice this!!! - We'll talk more about functional interfaces soon!
public interface BreadEventListener {
    void handleBreadEvent(EventObject eventObject);
}
