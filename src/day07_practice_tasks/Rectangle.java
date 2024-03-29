package day07_practice_tasks;

public class Rectangle {
    public double width;
    public double length;
    public double calculateArea;
    public double calculatePerimeter;

    public double calculateArea (){
        calculateArea = width * length;
        System.out.println("calculates the area of the rectangle," + calculateArea);
        return calculateArea;

    }
    public double calculatePerimeter(){
        calculatePerimeter = width + width + length + length;
        System.out.println("calculates the perimeter of the rectangle," + calculatePerimeter);
        return calculatePerimeter;
    }

    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
/*
reate a custom class named Rectangle with the following attributes and actions:

      Attributes:
            width (double): used for storing the width of the rectangle.
            length (double): used for storing the length of the rectangle.

      Actions:
            calculateArea(): calculates the area of the rectangle, and returns it as a double.
            calculatePerimeter(): calculates the perimeter of the rectangle, and returns it.
            toString(): returns a string representation of the rectangle object.


      Create another class named RectangleClients, create multiple rectangle objects, and test each function of the rectangle object.
 */
