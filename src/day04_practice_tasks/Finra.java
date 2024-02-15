package m15_selection_statements_part2;

public class Finra {
    public static void main(String[] args) {
        int number = 15;

        if (number % 15 == 0) {
            System.out.println("FINRA");
        } else if (number % 5 == 0) {
            System.out.println("RA");
        } else if (number % 3 == 0) {
            System.out.println("FIN");
        } else {
            System.out.println(number);
        }


    }
}
