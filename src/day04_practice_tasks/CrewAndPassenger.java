package m15_selection_statements_part2;

public class CrewAndPassenger {
    public static void main(String[] args) {
        int number = 75;

        if (number == 50){
            System.out.println("20 Crew, 30 Passengers");
        } else if (number == 75) {
            System.out.println("25 Crew, 50 Passengers");
        } else if (number == 100) {
            System.out.println("30 Crew, 70 Passengers");
        }else {
            System.out.println("Any other number of people on the ship is not valid");
        }

    }
}
