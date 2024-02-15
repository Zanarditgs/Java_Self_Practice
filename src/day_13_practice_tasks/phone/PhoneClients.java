package day_13_practice_tasks.phone;

public class PhoneClients {
    public static void main(String[] args) {
        Iphone iphone = new Iphone("iphone 15", "5.2 inches", 1049.49, "Titanium");
        Samsung samsung = new Samsung("Galaxy S24", "6.2 inches", 1299.99, "Gray");
        Nokia nokia = new Nokia("Brick", "2.4 inches", 49.99, "Yellow");


        System.out.println("Iphone:");
        System.out.println(iphone);
        iphone.call("21289074");
        iphone.text("21289074");
        System.out.println();

        System.out.println("Samsung:");
        System.out.println(samsung);
        samsung.text("9296661084");
        System.out.println();

        System.out.println("Nokia:");
        System.out.println(nokia);
        nokia.call("123456345");
    }

/*
4. Create a class named "PhoneClients":
   - Create multiple objects representing different phones.
   - Test the methods and variables of each object.
 */
}
