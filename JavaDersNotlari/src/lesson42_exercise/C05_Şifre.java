package lesson42_exercise;

import java.util.Scanner;

public class C05_Şifre {
    public static void main(String[] args) {
        //Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore kontrol
        //edin ve sifredeki hatalari yazdirin. Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli sifre
        //girdiginde “Sifreniz Kabul edilmistir” yazdirin.
        //Sifre kucuk harf icermelidir
        //Sifre buyuk harf icermelidir
        //Sifre ozel karakter icermelidir
        //Sifre en az 8 karakter olmalidir.

        Scanner scan = new Scanner(System.in);
        boolean sartbuyuk = false;
        boolean sartkucuk = false;
        boolean sartuzunluk = false;
        boolean sartozel = false;

        do {
            System.out.print("Lütfen Bir Şifre Giriniz: ");
            String sifre = scan.next();
            if (sifre.length() >=8) sartuzunluk = true;

            for (int i = 0; i < sifre.length(); i++) {
                if (sifre.charAt(i) >= 'A' && sifre.charAt(i) <= 'Z') sartbuyuk = true;
                if (sifre.charAt(i) >= 'a' && sifre.charAt(i) <= 'z') sartkucuk = true;
                if (sifre.charAt(i) >= '!' && sifre.charAt(i) <= '@') sartozel = true;
            }
            if (sartbuyuk == false) System.out.println("Şifre Büyük Harf İçermelidir");
            if (sartkucuk == false) System.out.println("Şifre Küçük Harf İçermelidir");
            if (sartozel == false) System.out.println("Şifre Özel Harf İçermelidir");
            if (sartuzunluk==false) System.out.println("Şifre 8 karakterden küçük olmamalı");
        } while ((sartbuyuk == false) || (sartkucuk == false) || (sartozel == false));
        System.out.println("Şifreniz Başarı ile kaydedilmiştir.");

    }
}
