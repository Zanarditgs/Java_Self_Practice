package m15_selection_statements_part2;

public class GradelLevel {
    public static void main(String[] args) {

        byte gradeLevel = 8;

        if (gradeLevel >= 1 && gradeLevel <= 5) {
            System.out.println("Elemantry School");
        } else if (gradeLevel >= 6 && gradeLevel == 8) {
            System.out.println("Middle School");
        } else if (gradeLevel >= 9 && gradeLevel <= 12) {
            System.out.println("High School");

        } else if (gradeLevel >= 13 && gradeLevel <= 16) {
            System.out.println("College");

        } else if (gradeLevel >= 17 && gradeLevel <= 18) {
            System.out.println("Grad School");
        } else {
            System.out.println("Invalid grade level");
        }

    }
}
