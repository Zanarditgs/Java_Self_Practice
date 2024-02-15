package m10_variables_data_types;

public class EmployeeInfo {
    public static void main(String[] args) {
        String employeeName;        employeeName = "Shay";
        int age;                    age = 24;
        char gender;                gender ='F';
        String companyName;         companyName = "Apple Inc";
        String jobTitle;            jobTitle = "SDET";
        double yearsOfExperience;   yearsOfExperience = 2.5;
        int salary;                 salary = 120_000;
        boolean isFullTime;         isFullTime = true;
        boolean isMarried;          isMarried = false;
        String employeeId;          employeeId = "B101";
        System.out.println("EmployeeName:"+employeeName+"\n"+"Gender: "+gender+"\n"+
                "Age: "+age+"\n"+"Employee ID: "+employeeId+"\n"+"Job Title: "+jobTitle+"\n"+
                "Company Name: "+companyName+"\n"+"Full Time: "+isFullTime+"\n"+
                "Years of the work experience: "+yearsOfExperience+" years"+"\n"+"Salary: "+'$'+
                salary+"\n"+"Married: "+isMarried);
        System.out.println("=======================================================");
        String newEmployeeName = "Huseyin";
        int employeeAge = 34;
        char employeeGender = 'M';
        String newCompanyName = "Amazon";
        String newJobTitle = "Automation SDET";
        double yearsOfExperiences = 8.5;
        int newSalary = 117_000;
        boolean isParttime = false;
        boolean isMarriedYet = true;
        String employeeIdNumber = "A101";

        System.out.println("New Employee Name:" + newEmployeeName);
        System.out.println("EmployeeAge:" + employeeAge);
        System.out.println("EmployeeGender:" + employeeGender);
        System.out.println("New Company Name:" + newCompanyName);
        System.out.println("New Job Title:" + newJobTitle);
        System.out.println("YearsOfExperiences" + yearsOfExperiences);
        System.out.println("NewSalary:" + '$' +newSalary);
        System.out.println("IsPart-time:" + isParttime);
        System.out.println("Is married Yet:" +isMarriedYet);
        System.out.println("Employee ID Number:" + employeeIdNumber);








    }
}
