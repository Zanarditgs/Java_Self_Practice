package day11_practice_tasks;

public class CydeoStudentClients {
    public static void main(String[] args) {
        CydeoStudent cydeoStudent1 = new CydeoStudent("Emiliano", "B33", 30, 727272, 6, 'A');
        cydeoStudent1.study();
        cydeoStudent1.attendClass();
        cydeoStudent1.printSchoolName();
        cydeoStudent1.printProgrammingLanguage();
        System.out.println(cydeoStudent1);
        System.out.println();

        CydeoStudent cydeoStudent2 = new CydeoStudent("Isabella","B14",26,343434,9,'B');
        cydeoStudent2.study();
        cydeoStudent2.attendClass();
        cydeoStudent2.printSchoolName();
        cydeoStudent2.printProgrammingLanguage();
        System.out.println(cydeoStudent2);


    }


}
