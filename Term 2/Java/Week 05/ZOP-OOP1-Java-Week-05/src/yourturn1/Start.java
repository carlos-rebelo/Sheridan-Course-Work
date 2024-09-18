package yourturn1;

public class Start {
    public static void main(String[] args) {
        OverloadedFun o1 = new OverloadedFun();
        System.out.println(o1.findLargest(1, 2));
        System.out.println(o1.findLargest(1, 2, 3));
        System.out.println(o1.findLargest(1, 2, 3, 4));
        System.out.println(o1.findLargest(1, 2, 3, 4, 5));
    }
}
