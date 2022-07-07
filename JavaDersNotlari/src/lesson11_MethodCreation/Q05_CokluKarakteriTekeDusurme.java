package lesson11_MethodCreation;

import java.util.Scanner;

public class Q05_CokluKarakteriTekeDusurme {
    public static void main(String[] args) {
 /*
        TASK  :
        Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method create ediniz.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd
     */
        Scanner scan=new Scanner(System.in);
        System.out.print("Bir String Giriniz: ");
        String str= scan.nextLine();

        tekrarlariBirKezYazdir(str);
    }

    private static void tekrarlariBirKezYazdir(String str) {

        for (int i = 0; i <str.length()-1; i++) {

            if (str.charAt(i)!=str.charAt(i+1)) {
                System.out.print(str.charAt(i));
            }
        }
    }

}
