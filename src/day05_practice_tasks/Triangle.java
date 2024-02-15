package jd05_loops_practice_task;

public class Triangle {
    public static void main(String[] args) {
        for (int i = 1; i < 12; i++){
            for (int j = 1; j <i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
