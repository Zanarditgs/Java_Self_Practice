package question_of_the_day;

public class Ternary_IfElse {
    public static void main(String[] args) {
        int score =25;
        String result;
        if (score >= 60){
            result = "Passed";

        }else {
            result = "Failed";

        }
        System.out.println(result);
        System.out.println("----------------------------------------------");
// Ternary If Else bu sekilde yukaridaki ile ayni sonucu aliyoruz ama daha az kod yaziyoruz
        String resul2 = (score >= 60) ? "Passed" :"Failed";
        System.out.println(resul2);

    }

}
