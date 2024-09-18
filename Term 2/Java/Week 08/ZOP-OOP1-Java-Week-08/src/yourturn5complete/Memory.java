package yourturn5complete;

/*  ⁡⁢⁣⁢Read Me: ⁡
Implementing this interface will allow the calculator to have the ability to use memory functionality


Adding to memory allows the use to store the current total in memory

clearing the memory sets it to 0

and getting the memory returns the value stored in memory
*/

public interface Memory {
    void clearMemory();

    void addToMemory();

    double getMemory();
}
