package lesson06_ifElseStatements;

import java.util.Scanner;

public class Q08_OdevKutsalGun {
    public static void main(String[] args) {
        //Soru 5) Kullanicidan bir gun alin eger gun “Cuma” ise ekrana “Muslumanlar icin kutsal
        //gun” yazdirin. “Cumartesi” ise ekrana “Yahudiler icin kutsal gun” yazdirin. “Pazar”
        //ise ekrana “Hiristiyanlar icin kutsal gun” yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Gün İsmi Giriniz: ");
        String gunIsmi=scan.next().toUpperCase();

        if (gunIsmi.equals("CUMA")){
            System.out.println("Müslümanlar İçin Kutsal Gün");
        }else if (gunIsmi.equals("CUMARTESİ")){
            System.out.println("Yahudiler icin kutsal gun");
        }else if (gunIsmi.equals("PAZAR")){
            System.out.println("Hiristiyanlar icin kutsal gun");
        } else {
            System.out.println("Kutsal Gün Değildir.");
        }

    }
}
