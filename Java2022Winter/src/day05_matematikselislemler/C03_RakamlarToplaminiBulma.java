package day05_matematikselislemler;

import java.util.Scanner;

public class C03_RakamlarToplaminiBulma {
    public static void main(String[] args) {
        // kullanıcıdan aldığınız 4 basamaklı bir sayının basamaklardaki rakamlar toplamını bulunuz

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen Dört Basamaklı BirTam sayı Girinzi:");
        int sayi= scan.nextInt();

        int rakam=0;
        int rakamlarToplami=0;

        //1.adım r=0 rt=0 sayi=7532
        rakam=sayi%10;
        rakamlarToplami+=rakam;//2
        sayi/=10;//753

        //2.adım r=2 rt=2 sayi=753
        rakam=sayi%10;
        rakamlarToplami+=rakam;//5
        sayi/=10;//75

        //3.adım r=3 rt=5 sayi=75
        rakam=sayi%10;
        rakamlarToplami+=rakam;//10
        sayi/=10;//7

        //4.adım
        rakam=sayi%10;//7
        rakamlarToplami+=rakam;//17
        sayi/=10;//0

        System.out.println("Girdiğiniz sayının rakamlar toplamı: "+rakamlarToplami);
    }
}
