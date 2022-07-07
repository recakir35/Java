package day03_scanner;

import java.util.Scanner;

public class C07_Odev {
    public static void main(String[] args) {
        // Soru 1) Kullanicidan iki tamsayi alip bu sayilarin toplam,fark ve carpimlarini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 1.Tamsayıyı Yazınız: ");

        int sayi1=scan.nextInt();
        System.out.println("Lütfen 2. Tamsayıyı Yazınız: ");
        int sayi2=scan.nextInt();

        System.out.println("Girilen Sayıların Toplamı: " + (sayi1+sayi2));
        System.out.println("Girilen Sayıların Farkı: " + (sayi1-sayi2));
        System.out.println("Girilen Sayıların Çarpımı: " + (sayi1*sayi2));

        //Soru 2) Kullanicidan karenin bir kenar uzunlugunu alin ve karenin cevresini ve alanini
        //hesaplayip yazdirin
        System.out.println("\nKarenin Kenar Uzunluğunu Giriniz: ");
        int kenaruzunluk=scan.nextInt();
        System.out.println("Karenin Çevresi :"+(4*kenaruzunluk));
        System.out.println("Karenin Alanı :"+(kenaruzunluk*kenaruzunluk));
        //Soru 4) Kullanicidan dikdortgenler prizmasinin uzun, kisa kenarlarini ve yuksekligini isteyip
        //prizmanin hacmini hesaplayip yazdirin

        //Soru 5) Kullanicidan ismini ve soyismini isteyip asagidaki sekilde yazdirin
        //Isminiz : Mehmet
        //Soyisminiz : Bulut
        //Kursumuza katiliminiz alinmistir,tesekkur ederiz

        System.out.println("\nİsminizi Yazınız: ");
        String isim=scan.nextLine();

        System.out.println("Soyisminizi Giriniz: ");
        String soyIsim=scan.nextLine();

        System.out.println("Kursumuza katiliminiz alinmistir,tesekkur ederiz");


    }
}
