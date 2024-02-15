package m15_selection_statements_part2;

public class AgeGroupsSwitch {
    public static void main(String[] args) {
        String category = "Senior";

        switch (category) {
            case "Teenager":
                System.out.println("Teenager (0 ~ 20)");
                break;
            case "Adult":
                System.out.println("Young Middle-Aged Adult (21 ~ 55)");
                break;
            case "Senior":
                System.out.println("Senior (55 or older)");
                break;
            default:
                System.out.println("Invalid");
                break;


        }



    }
}
