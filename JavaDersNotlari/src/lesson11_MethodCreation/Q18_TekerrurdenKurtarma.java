package practice_basic_day03;

import java.util.Scanner;

public class Q18_TekerrurdenKurtarma {
    public static void main(String[] args) {
     /*
        Problem tanımı :
        Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd
     */

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir String Giriniz: ");
        String str = scan.nextLine();

        birKereYazdir("aabbcccccddddaaa");
    }

    private static void birKereYazdir(String str) {
        String sonuc = "";

        for (int i = 0; i < str.length(); i++) {

            if (!sonuc.contains(str.substring(i,i+1))) {
                sonuc += str.substring(i,i+1);
            }
        }
        System.out.println(sonuc);
    }

}
