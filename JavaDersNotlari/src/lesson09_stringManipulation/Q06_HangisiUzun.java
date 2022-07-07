package lesson09_stringManipulation;

import java.util.Scanner;

public class Q06_HangisiUzun {
    public static void main(String[] args) {
        //Kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun oldugunu yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("İsminizi Giriniz: ");
        String isim = scan.nextLine();
        System.out.println("Soyisminizi Giriniz: ");
        String soyIsim = scan.nextLine();

        if (isim.length() > soyIsim.length()) {
            System.out.println("İsim daha uzundur. " + isim.length() + " Karakterdir");
        } else if (isim.length() < soyIsim.length()) {
            System.out.println("Soyisim daha uzundur. " + soyIsim.length() + " Karakterdir");
        }else System.out.println("İsim ve Soyisim Eşittir. İsim:" + isim.length() + " Karakterdir. Soyisim:"+ soyIsim.length() + " Karakterdir");
    }
}

