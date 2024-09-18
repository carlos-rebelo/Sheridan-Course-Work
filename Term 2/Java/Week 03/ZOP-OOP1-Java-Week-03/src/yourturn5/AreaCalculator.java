package yourturn5;

public class AreaCalculator {
    public void printOutFormulas() {
        System.out.println("Area of Rectangle = length * width\nArea of Square = length * length\nArea of Circle = PI * radius * radius\nArea of Triangle = 0.5 * base * height");
    }
    public double areaOfRectangle(double length, double width) {
       double area = length * width;
       return area; 
    }
    public double areaOfSquare(double length) {
        double area = length * length;
        return area; 
     }
    public double areaOfCircle(double radius) {
        double area = 3.14 * radius * radius;
        return area; 
    }
    public double areaOfTriangle(double base, double height) {
        double area = 0.5 * base * height;
        return area; 
     }
}
