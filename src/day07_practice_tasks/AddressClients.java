package day07_practice_tasks;

public class AddressClients {
    public static void main(String[] args) {
        Address address1 = new Address();
        address1.buildingNumber = 7925;
        address1.street = "Jones Branch Dr";
        address1.city = "McLean";
        address1.state = "VA";
        address1.zipCode = "22012";

        System.out.print(address1.buildingNumber +" ");
        System.out.println(address1.street);
        System.out.print(address1.city + " ");
        System.out.print(address1.state + ",");
        System.out.println(address1.zipCode);


        System.out.println(address1);
    }
}
