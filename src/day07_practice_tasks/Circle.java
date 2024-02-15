package day07_practice_tasks;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanMe = new Scanner(System.in);
        System.out.println("Enter the radius of the Circle:");
        double radius =scanMe.nextDouble();

        double area = 3.14 * (radius * radius);
        double perimeter = 2 * 3.14 * Math.round(radius*10.0)/10.0;


        System.out.println("The area of Circle is " + area);
        System.out.println("The perimeter of the Circle is " + perimeter);
        scanMe.close();

    }
}
/*
Create a class named Circle and write a program that asks the user to enter the radius of the Circle and calculate
the area and perimeter of the Circle.

        Example:
             Enter the radius:
             Input: 5

        Output:
             The area of the Circle is 78.5
             The perimeter of the Circle is 31.4

 */