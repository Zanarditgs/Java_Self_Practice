package m10_variables_data_types;

public class PhoneNumber {

    public static void main(String[] args) {
      byte countryCode = 1;
      int areaCode =703;
      int localNumber = 4512625;
      char plus = 43;

        System.out.println("Phone Number is:"+  plus + countryCode +"("+ areaCode +")"+"-"+localNumber);
        System.out.println("==================================");
        byte turkeyCode = 90;
        int turkeyAreaCode = 532;
        int turkeyLocalNumber = 3324178;
        char plusSign = 43;

        System.out.println("Phone Number is:" + plusSign + turkeyCode + "("+ turkeyAreaCode +")"+"-"+turkeyLocalNumber);

    }
}
