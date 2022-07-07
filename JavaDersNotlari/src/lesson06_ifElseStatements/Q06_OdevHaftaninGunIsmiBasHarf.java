package lesson06_ifElseStatements;

import java.util.Scanner;

public class Q06_OdevHaftaninGunIsmiBasHarf {
    public static void main(String[] args) {
        //Soru 2) Kullanicidan gun isimlerinden birinin ilk harfini isteyin ve o harfle baslayan gun
        //isimlerini yazdirin
        //Ornek:
        //ilkHarf=P output = “Pazar, Pazartesi veya Persembe”
        //ilkHarf=S output = “Sali”
        //*** Buyuk kucuk harf problem olmamasi icin toUpperCase methodunu kullanin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Aramak İstediğiniz Gün İsminin Baş Harfini Yazınız: ");
        char gunIsmiHarf = scan.next().toUpperCase().charAt(0);

        if (gunIsmiHarf == 'P') {
            System.out.println("Pazar, Pazartesi, Perşembe");
        } else if (gunIsmiHarf == 'C') {
            System.out.println("Cuma, Cumartesi");
        } else if (gunIsmiHarf == 'S') {
            System.out.println("Salı");
        } else if (gunIsmiHarf == 'Ç') {
            System.out.println("Çarşamba");
        } else System.out.println("Hatalı bir harf girdiniz. Tekrar deneyiniz.");
    }
}
