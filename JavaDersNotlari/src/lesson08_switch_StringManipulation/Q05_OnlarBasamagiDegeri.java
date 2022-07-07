package lesson08_switch_StringManipulation;

import java.util.Scanner;

public class Q05_OnlarBasamagiDegeri {

    // Girilen bir sayının onlar basamağının değerini yazı ile yazdırınız.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir sayı yazın: ");
        int sayi = scan.nextInt();
        int onlarbasamagi;

        if (sayi >= 100 || sayi < -100) {
            // Önce 10 böler sonra kalan sayının 10 bölümünden kalan 10'lar basamağına bulur
            onlarbasamagi = (sayi <= -10) ? ((-1 * sayi / 10) % 10) : ((sayi / 10) % 10);
            switch (onlarbasamagi) {
                case 1: System.out.println(" Onlar Basamağı: Bir"); break;
                case 2: System.out.println("Onlar Basamağı: İki"); break;
                case 3: System.out.println("Onlar Basamağı: Üç");  break;
                case 4: System.out.println("Onlar Basamağı: Dört"); break;
                case 5: System.out.println("Onlar Basamağı: Beş"); break;
                case 6: System.out.println("Onlar Basamağı: Altı"); break;
                case 7: System.out.println("Onlar Basamağı: Yedi"); break;
                case 8: System.out.println("Onlar Basamağı: Sekiz"); break;
                case 9: System.out.println("Onlar Basamağı: Dokuz"); break;
                case 0: System.out.println("Onlar Basamağı: 0"); break;
            }
        } else System.out.println("Lütfen 3 Basamak veya 3 Basamaktan fazla bir sayı giriniz.");
    }
}
