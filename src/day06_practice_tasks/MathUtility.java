package day06_practice_tasks;

public class MathUtility {
    public static void main(String[] args) {

        int resultI = calculate(10, '+', 20);
        System.out.println(resultI);
        double resultD = calculate(2.5, '*', 3.0);
        System.out.println(resultD);
        int squareI = square(8);
        System.out.println(squareI);
        double squareD = square(1.5);
        System.out.println(squareD);
        int cubeI = cube(3);
        System.out.println(cubeI);
        double cubeD = cube(2.5);
        System.out.println(cubeD);
    }

    public static int calculate(int num1, char operator, int num2) {
        int result;
        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            result = num1 / num2;
        } else {
            result = 0;
        }
        return (result);
    }

    public static double calculate(double num1, char operator, double num2) {
        double result;
        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            result = num1 / num2;
        } else {
            result = 0;
        }
        return (result);
    }

    public static int square(int num) {
        return calculate(num, '*', num);
    }

    public static double square(double num) {
        return calculate(num, '*', num);
    }

    public static int cube(int num) {
        return square(num) * num;
    }

    public static double cube(double num) {
        return square(num) * num;
    }
}
