package lesson12_ForLop;

import java.util.Scanner;

public class Q05_Toplama {
    public static void main(String[] args) {
        //Kullanicidan iki sayi isteyin. Girilen sayilar ve aralarindaki tum tamsayilari
        //toplayip, sonucu yazdiran bir program yaziniz (Girilen Sayılar Hariç)

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen 1.Sayıyı Giriniz: ");
        int sayi1 = scan.nextInt();
        System.out.print("Lütfen 2.Sayıyı Giriniz: ");
        int sayi2 = scan.nextInt();
        int toplam = 0;

        System.out.println("Girilen 1. Sayı: " + sayi1);
        System.out.println("Girilen 2. Sayı: " + sayi2);
        if (sayi1 > sayi2) {
            int temp = sayi2;
            sayi2 = sayi1;
            sayi1 = temp;
        }
        for (int i = sayi1; i < sayi2; i++) {
            toplam += i;

        }
        System.out.println("Girilen Sayılar Arasındaki Sayılar Toplamı: " + toplam);
    }
}