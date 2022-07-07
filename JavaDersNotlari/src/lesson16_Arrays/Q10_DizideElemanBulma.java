package lesson16_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q10_DizideElemanBulma {
    public static void main(String[] args) {
       /*
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
         kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
        */
        Scanner scan = new Scanner(System.in);
        int arr[] = new int[8];
        int sayac = 1;

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Lütfen Dizinin " + (i + 1) + " Elemanını giriniz: ");
            arr[i] = scan.nextInt();

            if (arr[i] % 3 == 0) {
                sayac++;
            }
        }
        System.out.println("\nDizi: "+Arrays.toString(arr));
        System.out.println("Dizide 3'e bölünebilen " + (sayac - 1) + " element vardır");
    }
}