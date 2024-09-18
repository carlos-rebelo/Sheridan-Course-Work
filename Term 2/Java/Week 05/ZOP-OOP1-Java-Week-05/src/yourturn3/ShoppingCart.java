package yourturn3;

public class ShoppingCart {
    private Item item1;
    private Item item2;
    private Item item3;
    private int numOfItemsInCart;
    private double totalCost;

    public void addItemToCart(Item item) {
        if (item1 == null) {
            this.item1 = item;
            numOfItemsInCart += 1;
            return;
        }
        else if (item2 == null){
            this.item2 = item;
            numOfItemsInCart += 1;
            return;
        }
        else if (item3 == null){
            this.item3 = item;
            numOfItemsInCart += 1;
            return;
        }
        System.out.println("Sorry, Shopping cart is full!");
    }

    public int getNumOfItemsInCart() {
        return numOfItemsInCart;
    }
    public double getTotalCost() {
        if (numOfItemsInCart == 1) {
            totalCost = item1.getCost();
        }
        else if (numOfItemsInCart == 2) {
            totalCost = item1.getCost() + item2.getCost();
        }
        else {
            totalCost = item1.getCost() + item2.getCost() + item3.getCost();
        }
        return totalCost;
    }

    public void printOutItemsInCart() {
        if (numOfItemsInCart == 1){
            System.out.println("Item 1 Description: "+item1.getDescription()+"\nItem 1 Cost: "+item1.getCost());
            return;
        }
        else if (numOfItemsInCart == 2){
            System.out.println("Item 1 Description: "+item1.getDescription()+"\nItem 1 Cost: "+item1.getCost());
            System.out.println("Item 2 Description: "+item2.getDescription()+"\nItem 2 Cost: "+item2.getCost());
            return;
        }
        else {
            System.out.println("Item 1 Description: "+item1.getDescription()+"\nItem 1 Cost: "+item1.getCost());
            System.out.println("Item 2 Description: "+item2.getDescription()+"\nItem 2 Cost: "+item2.getCost());
            System.out.println("Item 3 Description: "+item3.getDescription()+"\nItem 3 Cost: "+item3.getCost());
        }
        
        
    }

}
