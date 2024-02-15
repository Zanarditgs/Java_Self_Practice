package day12_practice_tasks;

public class ItemClients {
    public static void main(String[] args) {

        Item item1 = new Item("Bread", 4.99, 2);
        System.out.println(item1.getName());
        System.out.println(item1.getUnitPrice());
        System.out.println(item1.getQuantity());
        System.out.println(item1);

        System.out.println();

        Item item2 = new Item("Soy Sauce", 2.49, 1);
        System.out.println(item2.getName());
        System.out.println(item2.getUnitPrice());
        System.out.println(item2.getQuantity());
        System.out.println(item2);


        System.out.println();


        Item item3 = new Item(" ", 0, 2);
        System.out.println(item3.getName());
        System.out.println(item3.getUnitPrice());
        System.out.println(item3.getQuantity());
        System.out.println(item3);

    }
}

