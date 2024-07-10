package question_of_the_day;

public class NestedIfStatement {
    public static void main(String[] args) {
        int score = 185; // 1- 100

        if (score >= 1 && score <= 100) {
            if (score >= 60) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
        } else {
            System.out.println("Invalid Score");
        }
    }
}
