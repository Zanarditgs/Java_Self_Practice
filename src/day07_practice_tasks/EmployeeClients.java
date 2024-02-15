package day07_practice_tasks;

public class EmployeeClients {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.name = "Huseyin";
        employee1.age= 33;
        employee1.gender = 'M';
        employee1.jobTitle = "Team Leader";
        employee1.salary =  11_000;

        System.out.println("Employee Name:" + employee1.name);
        System.out.println("Employee Age:" + employee1.age);
        System.out.println("Employee Gender:" + employee1.gender);
        System.out.println("Employee JobTitle:" + employee1.jobTitle);
        System.out.println("Employee Salary:$" + employee1.salary);

        employee1.work();
        employee1.toString();
        System.out.println(employee1);

        System.out.println("-------===============------------");

        Employee employee2 = new Employee();
        employee2.name = "Hasan";
        employee2.age= 32;
        employee2.gender = 'M';
        employee2.jobTitle = "SuperVisior";
        employee2.salary =  9900;

        System.out.println("Employee Name:" + employee2.name);
        System.out.println("Employee Age:" + employee2.age);
        System.out.println("Employee Gender:" + employee2.gender);
        System.out.println("Employee Job Title:" + employee2.jobTitle);
        System.out.println("Employee Salary:$" + employee2.salary);

        employee2.work();
        employee2.toString();
        System.out.println(employee2);

        System.out.println("---------=============----------");

        Employee employee3 = new Employee();
        employee3.name = "Sonal";
        employee3.age= 33;
        employee3.gender = 'F';
        employee3.jobTitle = "Store Owner";
        employee3.salary =  15000;

        System.out.println("Employee Name:" + employee3.name);
        System.out.println("Employee Age:" + employee3.age);
        System.out.println("Employee Gender:" + employee3.gender);
        System.out.println("Employee Job Title:" + employee3.jobTitle);
        System.out.println("Employee Salary:$" + employee3.salary);

        employee3.work();
        employee3.toString();
        System.out.println(employee3);
    }
}
