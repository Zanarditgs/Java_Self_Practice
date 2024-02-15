package day07_practice_tasks;

public class RectangleClients {
    public static void main(String[] args) {
Rectangle rectangle1 = new Rectangle();

    rectangle1.width = 3.4;
    rectangle1.length = 2.2;

    rectangle1.calculateArea();
    rectangle1.calculatePerimeter();
        System.out.println(rectangle1);


        System.out.println("------------===============-------------");
        Rectangle rectangle2 = new Rectangle();
        rectangle2.width = 5.7;
        rectangle2.length = 6.6;

        rectangle2.calculateArea();
        rectangle2.calculatePerimeter();
        System.out.println(rectangle2);

        System.out.println("------==========-----");
        Rectangle rectangle3 = new Rectangle();

        rectangle3.width = 8.4;
        rectangle3.length = 3.3;

        rectangle3.calculateArea();
        rectangle3.calculatePerimeter();
        System.out.println(rectangle3);

}

}

