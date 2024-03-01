package question_of_the_day;

public class Question {
    public static void main(String[] args) {
        String numbers = "abcdefghij";
        int length = numbers.length();

        for (int i = 0; i < length; i++) {
            System.out.print((int) numbers.charAt(i) - (int) 'a' + ",");
        }
    }
}
