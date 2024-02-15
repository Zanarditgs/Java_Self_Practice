package day07_practice_tasks;

public class ItemClients {
    public static void main(String[] args) {
        Item item1 = new Item();
        item1.itemName = "Halloumi Cheese";
        item1.unitPrice = 3.5;
        item1.quantity = 5;


        System.out.println("Item Name:" + item1.itemName);
        System.out.println("Unit Price:$" + item1.unitPrice);
        System.out.println("Quantity:" + item1.quantity);


        item1.calcCost();
        item1.toString();
        System.out.println(item1);

        System.out.println("-----=============================-----");
            Item item2 = new  Item();
            item2.itemName = "Turkish Bread";
            item2.unitPrice = 2.5;
            item2.quantity = 2;

        System.out.println("Item Name:" + item2.itemName);
        System.out.println("Unit price:" + item2.unitPrice);
        System.out.println("Quantity:" + item2.quantity);



        item2.calcCost();
        item2.toString();
        System.out.println(item2);


    }
}
