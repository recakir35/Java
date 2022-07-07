package lesson13_WhileLoop;

import java.util.Scanner;

public class Q06_TeksayilariToplama {
    /*
         Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
         girilen sayı dahil
        */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int sayi = scan.nextInt();

        for (int i = 0; i <=sayi; i++) {
           if (i%2!=0) {
               System.out.print(i+" ");
           }

        }
    }

}
