package day19_doWhileLoop;

import java.util.Scanner;

public class C06_ForLoop {
    public static void main(String[] args) {
        //Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den baslayarak girilen sayiya kadar 3’un
        //kati olan sayilari yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen 100 'den küçük bir sayı tam sayı giriniz: ");
        int sayi = scan.nextInt();

        if (sayi <= 100 && sayi >0) {
            for (int i = 1; i <= sayi; i++) {
                if (i % 3 == 0) {
                    System.out.print(i + " ");
                }
            }
        } else System.out.println("Yanlış sayı girdiniz.Tekrar deneyiniz.");
    }
}
