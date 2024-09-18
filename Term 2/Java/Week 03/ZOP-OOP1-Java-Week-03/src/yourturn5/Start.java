package yourturn5;

/*  ⁡⁢⁣⁢Read Me!⁡
 
Write a class called AreaCalculator that:

    has a method called printOutFormulas that will accept no arguments, return no value, but will print out the following:
            Area of Rectangle = length * width
            Area of Square = length * length
            Area of Circle = PI *radius *radius 
            Area of Triangle = .5*base * height

    has a method called areaOfRectangle which will accept two doubles: length and width, and will RETURN the area of the rectangle to the calling class

    has a method called areaOfSquare which will accept a single double (length) and will return the area of the square

    has a methodcalled areaOfCircle which will accept a double (radius) and will return the area of the circle

    has a method called areaOfTriangle that will accept a double for the base and a double for the height and will return the area of the triangle

    Finally, Instantiat an AreaCalculator in the main method below and test out all of your methods!
 */

public class Start {
    public static void main(String[] args)
    {
        AreaCalculator calc1 = new AreaCalculator();
        calc1.printOutFormulas();
        double areaOfSquare = calc1.areaOfSquare(20);
        System.out.println("Area of square is "+areaOfSquare);
        double areaOfRectangle = calc1.areaOfRectangle(20,10);
        System.out.println("Area of rectangle is "+areaOfRectangle);
        double areaOfCircle = calc1.areaOfCircle(8);
        System.out.println("Area of circle is "+areaOfCircle);
        double areaOfTriangle = calc1.areaOfTriangle(20,30);
        System.out.println("Area of triangle is "+areaOfTriangle);
    }
}
