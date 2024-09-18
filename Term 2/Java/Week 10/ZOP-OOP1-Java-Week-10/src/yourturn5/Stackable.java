package yourturn5;

public interface Stackable {
    void push(Car car); // pushes a car onto the stack

    Car pop(); //pops a Car object off the stack and returns it

    int size(); //returns the size of the stack

    Car peek(); //returns the next Car object on the stack but does not remove it from the stack
}
