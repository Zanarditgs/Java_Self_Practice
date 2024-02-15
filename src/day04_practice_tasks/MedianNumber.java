package m15_selection_statements_part2;

public class MedianNumber {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int c = 20;

        if (a > b && a < c) {
            System.out.println(a + " is the median number");
        } else if (b > a && b < c) {
            System.out.println(b + " is the median number");
        } else {
            System.out.println(c + " is the median number");
        }
    }
}

