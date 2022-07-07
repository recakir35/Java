package lesson09_stringManipulation;

import java.util.Scanner;

public class Q04_TerstenYazdir {
    public static void main(String[] args) {
        // TASK : Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Bir Kelime Giriniz: ");
        String kelime = scan.next();

        for (int i = kelime.length()-1; i >=0 ; i--) {

            System.out.print(kelime.charAt(i));

        }



    }
}
