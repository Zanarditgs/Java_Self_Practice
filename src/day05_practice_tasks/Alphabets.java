package jd05_loops_practice_task;

public class Alphabets {
    public static void main(String[] args) {
        for (char i = 'A'; i <= 'E'; i++) {
            for (char j = 'a'; j <= 'z'; j++) {
                System.out.print(i);
                System.out.print(j + " ");
            }
            System.out.println();
        }


        System.out.println("----------------------------");
// veya asagidaki gibide yapabiliriz

        for (char i = 'A'; i <= 'E'; i++) {
            for (char j = 'a'; j <= 'z'; j++) {
                System.out.print(i);
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

