package question_of_the_day;

public class SwitchStatement {
    public static void main(String[] args) {
        char grade = 'B';

        if (grade == 'A') {  // this is IF STATEMENT
            System.out.println("Excellent");
        } else if (grade == 'B') {
            System.out.println("Great Job");
        } else if (grade == 'C') {
            System.out.println("Good");
        } else if (grade == 'D') {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }

        System.out.println("--------------------------------------------------");

        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Great Job");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Passed");
                break;
            default:
                System.out.println("Failed");
        }
    }
}
