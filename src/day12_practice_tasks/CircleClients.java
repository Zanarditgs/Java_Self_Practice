package day12_practice_tasks;

public class CircleClients {
    public static void main(String[] args) {
        Circle circle1 = new Circle(4);
        System.out.println(circle1.getRadius());
        System.out.println(circle1.calcPerimeter());
        System.out.println(circle1.calcArea());
        System.out.println(circle1);
        System.out.println();

        Circle circle2 = new Circle(10);
        System.out.println(circle2.getRadius());
        System.out.println(circle2.calcPerimeter());
        System.out.println(circle2.calcArea());
        System.out.println(circle2);
        System.out.println();

        Circle circle3 = new Circle(0);
        System.out.println(circle3);
    }
}
