package m15_selection_statements_part2;

public class Grade {
    public static void main(String[] args) {
        char grade = 'B';
        if (grade == 'A') {
            System.out.println("Excellent");
        } else if (grade == 'B') {
            System.out.println("Great Job");
        } else if (grade == 'C') {
            System.out.println("Good");
        } else if (grade == 'D') {
            System.out.println("Passed");
        } else if (grade == 'F') {
            System.out.println("Failed");
        } else {
            System.out.println("Invalid Grade");
        }


    }
}
