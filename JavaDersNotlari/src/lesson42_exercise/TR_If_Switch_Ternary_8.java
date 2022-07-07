package lesson42_exercise;

import java.util.Scanner;

public class TR_If_Switch_Ternary_8 {
    public static void main(String[] args) {
        /*Kullanıcıdan bir isim girmesini isteyin ve son 2 harfinin 3 kopyasından oluşan yeni bir String yazdırın
    Kullanicidan alinan isim uzunluğu en az 2 olacaktır.
    INPUT : Mustafa
    OUTPUT : fafafa
         */
        Scanner scan =new Scanner (System.in);
        System.out.println("Lütfen bir isim giriniz: ");
        String name = scan.next();

        System.out.println(name.substring(name.length()-2)+name.substring(name.length()-2)+name.substring(name.length()-2));
    }
}
