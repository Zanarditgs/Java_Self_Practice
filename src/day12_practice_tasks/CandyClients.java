package day12_practice_tasks;

public class CandyClients {
    public static void main(String[] args) {
        Candy candy1 = new Candy("Ulker", 2, 0, false);
        System.out.println(candy1.getBrand());
        System.out.println(candy1.getQuantity());
        System.out.println(candy1.getPrice());
        System.out.println(candy1.isHasPeanuts());
        System.out.println(candy1);

        System.out.println();

        Candy candy2 = new Candy("Chocolate Bar", 5, 2.75, true);
        System.out.println(candy2.getBrand());
        System.out.println(candy2.getQuantity());
        System.out.println(candy2.getPrice());
        System.out.println(candy2.isHasPeanuts());
        System.out.println(candy2);

        System.out.println();

        Candy candy3 = new Candy("Kit-Kat", 0, 0, true);
        System.out.println(candy3);
    }
}
