package lesson09_stringManipulation;

import java.util.Scanner;

public class Q11_SifreKontrol {
    public static void main(String[] args) {
        // Soru 6) Kullanicidan bir sifre girmesini isteyin.
        // Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
        // sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
        //  - Ilk harf buyuk harf olmali
        //  - Son harf kucuk harf olmali
        //  - Sifre bosluk icermemeli
        //  - Sifre uzunlugu en az 8 karakter olmali

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen Şifre Giriniz: ");
        String sifre = scan.nextLine();

        boolean ilkHarf = false;
        if (sifre.charAt(0) >= 'A' && sifre.charAt(0) <= 'Z') {
            ilkHarf = true;
        } else System.out.println("!!Girdiğiniz Şifrenin İlkharfi Büyük olmalı!!");

        boolean sonHarf = false;
        if (sifre.charAt(sifre.length() -1) >= 'a' && sifre.charAt(sifre.length()-1)  <= 'z') {
            sonHarf = true;
        } else System.out.println("!!Girdiğiniz Şifrenin Sonharfi küçük olmalı!!");

        boolean bosluk = false;
        if (!sifre.contains(" ")) {
            bosluk = true;
        } else System.out.println("!!Girdiğiniz Şifre boşluk içermemeli!!");

        boolean harfSayisi = false;
        if (sifre.length() >= 8) {
            harfSayisi = true;
        } else System.out.println("!!Girdiğiniz Şifre 8 karakter veya büyük olmalı!!");

        if (ilkHarf && sonHarf && bosluk && harfSayisi) {
            System.out.println("Şifreniz başarı ile tanımlandı");
        } else System.out.println("!!Girdiğiniz Şifre yanlış tekrar giriniz!!");
    }
}