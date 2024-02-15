package jd05_loops_practice_task;

public class SumOfNumbers2 {
    public static void main(String[] args) {
        int sum = 0;
        int num = 50;
        for (int i = 0; i <= num; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
