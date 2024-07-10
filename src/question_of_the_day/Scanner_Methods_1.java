package question_of_the_day;

import java.util.Scanner;

public class Scanner_Methods_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age:");

        int age = input.nextInt();

        System.out.println("age = " + age);


    }
}
