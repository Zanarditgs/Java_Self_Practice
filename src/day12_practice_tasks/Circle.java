package day12_practice_tasks;

import java.util.PrimitiveIterator;

public class Circle {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if (radius <= 0) {
            System.err.println("The radius cannot be set to a negative or zero value.");
            System.exit(1);
        }
        this.radius = radius;
    }

    public Circle(int radius) {
        setRadius(radius);
    }

    public double calcArea() {
        return Math.round(Math.PI * Math.pow(radius, 2));
    }

    public double calcPerimeter() {
        return Math.round(2 * Math.PI * radius);
    }

    public String toString() {
        return "Circle{" +
                " radius = " + radius +
                ", area = " + calcArea() +
                ", perimeter = " + calcPerimeter() +
                '}';
    }

}