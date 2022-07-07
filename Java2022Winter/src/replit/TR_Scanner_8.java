package replit;

import java.util.Scanner;

public class TR_Scanner_8 {
    public static void main(String[] args) {
        //Kullanıcıdan üç basamaklı bir sayı girmesini ve bu sayının basamaklarının toplamını bulmasını isteyin.
        //
        //Örnek Çıktı:
        //
        //Verilen tamsayının rakamları toplamı 10'dur.
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen Üç Basamaklı bir Sayı Giriniz: ");
        int sayi=scan.nextInt();
        int toplam=0;

        if (sayi>=1000){
            while (sayi!=0){
                toplam+=sayi%10;
                sayi=sayi/10;
            }
            System.out.println("Verilen tamsayinin rakamlari toplami "+toplam+"'dur.");
        }else System.out.println("Lütfen 3 Basamaklı sayı giriniz");

    }
}
