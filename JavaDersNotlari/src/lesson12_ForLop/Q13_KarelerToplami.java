package lesson12_ForLop;

import java.util.Scanner;

public class Q13_KarelerToplami {
    /*        Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
              ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
              hesaplayan kodu yazınız.

             Örnek Ekran Çıktısı
             Girilen sayı=4
             Kareler toplamı=14
          */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen Birden Büyük bir tamsayı giriniz: ");
        int sayi = scan.nextInt();

        int toplam = 0;

        if (sayi > 0) {
            for (int i = 1; i <= sayi; i++) {
               toplam+=i*i;
            }
            System.out.println("Girilen Sayı: "+sayi);
            System.out.println("Girilen Sayıyakadar olan sayıların karelerinin toplamı: "+toplam);
        } else System.out.println("Lütfen 0 dan büyük bir tamsayı giriniz");

    }

}
