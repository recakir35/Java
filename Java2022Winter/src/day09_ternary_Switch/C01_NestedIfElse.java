package day09_ternary_Switch;

import java.util.Scanner;

public class C01_NestedIfElse {
    public static void main(String[] args) {
        // Kullanıcıdan 4 basamakli bir sayi girmesini isteyin. Girdiği sayi 5’e
        // bölünüyorsa son rakamını kontrol edin. Son rakamı 0 ise ekrana “5’e bölünen
        // çift sayı” yazdırın. Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
        // Girdiği password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 4 basamaklı tam pozitif sayı giriniz: ");
        int sayi = scan.nextInt();

        if (sayi < 1000 || sayi > 9999) { // istenmeyen durumu yazıyoruz
            System.out.println("Lütfen 4 basamaklı pozitif tam sayı giriniz.");
        } else if (sayi % 5 == 0) { // sayi 5'e tam bölünür

            if (sayi % 10 == 0) {
                System.out.println("5’e bölünen çift sayı");
            } else System.out.println("5’e bölünen tek sayı");

        } else {// 4 basamaklı ve 5' bölünemiyor
            System.out.println("Tekrar deneyin");

        }
    }
}
