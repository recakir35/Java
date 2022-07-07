package lesson07_ternary_Switch;

import java.util.Scanner;

public class Q14_SayiBasamak {

    public static void main(String[] args) {
        /*
        TASK :
         Kullanıcıdan bir pozitif tamsayı girmesini isteyin, o pozitif tamsayı 3 basamaklı ise ekrana “3 Basamaklı” yazdırın.
         3 basamaklı degilse çift olup olmadigini kontrol edin. Çift ise “3 basamaklı olmayan çift sayı” yazdırın.
         Çift sayı degilse “3 basamaklı olmayan tek sayı yazdırın.”
         */
Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen pozitif bir sayı giriniz: ");
        int sayi=scan.nextInt();

        String sonuc=(sayi>99 && sayi<1000) ?("3 Basamaklı Sayı") :(sayi%2==0) ? ("3 Basamaklı olmayan Çift Sayı") : ("3 Basamaklı olmayan tek sayı");
        System.out.println(sonuc);
    }
}