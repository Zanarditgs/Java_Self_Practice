package m15_selection_statements_part2;

public class CalculatorPracticeTask {
    public static void main(String[] args) {
        double n1 = 10;
        double n2 = 20;
        char mathOperator = '+';
        switch (mathOperator){
            case '+':
                System.out.println("Addition:" + (n1+n2));
                break;
            case '-':
                System.out.println("Subtraction:" + (n1-n2));
                break;
            case '*':
                System.out.println("Multiplication:" + (n1*n2));
                break;
            case'/':
                System.out.println("Division:" + (n1/n2));
            default:
                System.out.println("Invalid Operator");
        }
    }
}
