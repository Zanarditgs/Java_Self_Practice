package jd05_loops_practice_task;

public class FINRA {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++){
            if (i % 3 == 0 && i % 5 ==0){
                System.out.print("FINRA");
            } else if (i % 3 == 0) {
                System.out.print("FIN ");
            } else if (i % 5 == 0) {
                System.out.print("RA ");
            }else {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("==================================");


        int number1 = 100;
        int number2 = 1;
        do {
            if (number2 % 3 == 0 && number2 % 5 == 0) {
                System.out.print("FINRA");
            } else if (number2 % 3 == 0) {
                System.out.print("FIN ");
            } else if (number2 % 5 == 0) {
                System.out.print("RA ");
            } else {
                System.out.print(number2 + " ");
            }
            number2++;

        } while (number2 <= number1);
    }
}
