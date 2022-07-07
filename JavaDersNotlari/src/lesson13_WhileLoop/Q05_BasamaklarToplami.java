package lesson13_WhileLoop;

import java.util.Scanner;

public class Q05_BasamaklarToplami {
    // girilen sayının basamaklarındaki rakamların toplamını bulunuz.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int sayi = scan.nextInt();
        int toplam=0;


        for (int i = 0; i < sayi ; i++) {
            toplam+=sayi%10;
            sayi=sayi/10;
            System.out.println(toplam);
        }

    }
}