package lesson11_MethodCreation;

import java.util.Scanner;

public class Q06_TerstenYazdir {
    public static void main(String[] args) {
    /*      TASK:
        reverseString isminde bir method create ediniz.
        Bu method bir String'i parametre olarak alsın.
        Ve bu method, girilen String'i tersten print etsin.


        Örn: String = "Java'yı Seviyorum."
        Print: .muroyiveS ıy'avaJ
         */
        Scanner scan=new Scanner(System.in);
        System.out.print("Bir String Giriniz: ");
        String str= scan.nextLine();

        reverseString(str);

    }

    private static void reverseString(String str) {
        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.print(str.charAt(i));

        }
    }
}
