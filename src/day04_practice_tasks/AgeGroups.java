package m15_selection_statements_part2;

public class AgeGroups {
    public static void main(String[] args) {
        int age = 42;
        if (age < 0 || age > 150) {
            System.out.println("Invalid.");
        } else if (age <= 20) {
            System.out.println("Teenager");
        } else if (age <= 55) {
            System.out.println("Young Middle-Aged Adult");
        } else {
            System.out.println("Senior");
        }
    }

    }

