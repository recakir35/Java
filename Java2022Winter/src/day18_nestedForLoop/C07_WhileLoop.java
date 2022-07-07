package day18_nestedForLoop;

import java.util.Scanner;

public class C07_WhileLoop {
    public static void main(String[] args) {

        //kullanıcıdan kaç sayı toplamak istediğini alın
        // ve bu sayıların toplamını ekrana yazdırın
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet Sayı toplamak istiyorsunuz: ");
        int sayiAdedi=scan.nextInt();
        int sayi=0;
        int toplam=0;

        for (int i = 1; i <=sayiAdedi ; i++) {
            System.out.print("Lütfen bir sayı giriniz: ");
            sayi= scan.nextInt();
            toplam+=sayi;
        }
        System.out.println("Girilen Sayıların Toplamı: "+toplam);

        // while ile
        sayi=0;
        toplam=0;
        int sayac=1;

        while(sayac<=sayiAdedi){
            System.out.print("Lütfen bir sayı giriniz: ");
            sayi= scan.nextInt();
            toplam+=sayi;
            sayac++;
        }
        System.out.println("Girilen Sayıların Toplamı: "+toplam);
    }
}
