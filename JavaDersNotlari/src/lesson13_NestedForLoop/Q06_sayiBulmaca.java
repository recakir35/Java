package lesson13_NestedForLoop;

import java.util.Random;
import java.util.Scanner;

public class Q06_sayiBulmaca {
    public static void main(String[] args) {
        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin
        Random rnd = new Random();
        int sayi=rnd.nextInt(100); // burası 100'den küçük rastgele bir sayı oluşturur
        Scanner scan=new Scanner(System.in);
        int tahmin=0;
        int sayac=0;

        while (sayi!=tahmin){
            System.out.print("Lütfen bir sayı giriniz: ");
            tahmin=scan.nextInt();
            if (tahmin>sayi){
                System.out.println("Daha küçük bir sayı söylemelisin");
            }else if (tahmin<sayi){
                System.out.println("Daha büyük bir sayı söylemelisin");
            }
            sayac++;
        }
        System.out.println("Tuttuğum sayıyı "+ sayac + " tahminde buldunuz");

    }
}
