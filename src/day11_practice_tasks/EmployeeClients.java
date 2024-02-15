package day11_practice_tasks;

public class EmployeeClients {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Huseyin", 34, "Sdet", 'M', 98_000);
        System.out.println(employee1);
        System.out.println(employee1.work());

        System.out.println();

        Employee employee2 = new Employee("Khasan", 23, "Sdet", 'M', 98_000);
        System.out.println(employee2);
        System.out.println(employee2.work());

        System.out.println();

        Employee employee3 = new Employee("Kamal",28,"Sdet",'M',98_000);
        System.out.println(employee3);
        System.out.println(employee3.work());
    }
}
