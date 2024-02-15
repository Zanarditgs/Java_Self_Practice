package day11_practice_tasks;

public class Employee {
    public String name;
    public String jobTitle;
    public int age;
    public char gender;
    public double salary;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Employee(String name, int age, String jobTitle, char gender) {
        this(name, age);
        this.jobTitle = jobTitle;
        this.gender = gender;
    }

    public Employee(String name, int age, String jobTitle, char gender, double salary) {
        this(name, age, jobTitle, gender);

        this.salary = salary;
    }

    public String work() {
        return jobTitle + " " + name + " is working.";
    }

    @Override
    public String toString() {
        return "Employee's{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", salary= $" + salary +
                '}';
    }
}
/*
3. Create a custom class named Employee with the following specifications:

	Attributes:
			name (String)
			age (int)
			gender (char)
			jobTitle (String)
			salary (double)

    Constructors:
			Add multiple constructors to set different fields of the employee object.

    Actions:
		work(): prints the job title and name of the employee concatenated with " is working."
		toString(): returns a string representation of the employee object.

	Create another class named EmployeeClients, create multiple employee objects, and test each function of the employee object.

*/