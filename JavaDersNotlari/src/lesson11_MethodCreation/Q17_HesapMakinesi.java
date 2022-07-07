package practice_basic_day03;

import java.util.Scanner;

public class Q17_HesapMakinesi {
    public static void main(String[] args) {
      /*
      Problem Tanımı :
      Basit 4 islem yapan bir hesap makinesi kodlayiniz....
      Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinız.
      Kullanicidan iki sayi girmesini isteyiniz.
      Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
    */

        Scanner scan = new Scanner(System.in);
        System.out.print("Toplama: (+)\nÇıkarma: (-)\nÇarpma: (*)\nBölme: (+)\nSeçim Yapınız: ");
        char islem = scan.next().charAt(0);

        System.out.print("Lütfen 1.Sayıyı Giriniz: ");
        double sayi1 = scan.nextDouble();
        System.out.print("Lütfen 2.Sayıyı Giriniz: ");
        double sayi2 = scan.nextDouble();
        hesapMakinesi(islem, sayi1, sayi2);

    }

    private static void hesapMakinesi(char islem, double sayi1, double sayi2) {
        switch (islem) {
            case '+':
                System.out.println(sayi1 + " + " + sayi2 + "= " + (sayi1 + sayi2));
                break;
            case '-':
                System.out.println(sayi1 + " - " + sayi2 + "= " + (sayi1 - sayi2));
                break;
            case '/':
                System.out.println(sayi1 + " / " + sayi2 + "= " + (sayi1 / sayi2));
                break;
            case '*':
                System.out.println(sayi1 + " * " + sayi2 + "= " + (sayi1 * sayi2));
                break;

        }
    }
}
