package day18_nestedForLoop;

import java.util.Scanner;

public class C01_ForLoopFaktoriyel {
    public static void main(String[] args) {
        //Soru 11 ) Interview Question: Kullanicidan 10’dan kucuk bir tamsayi isteyin ve girilen
        //sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen 10'dan küçük Bir Tamsayı Giriniz: ");
        int sayi = scan.nextInt();

        faktoriyelHesapla(sayi);
    }

    private static void faktoriyelHesapla(int sayi) {
        int faktoriyel =1;
        for (int i = sayi; i >=1 ; i--) {
            faktoriyel *=i;

        }
        System.out.println(sayi+"!= "+ faktoriyel);
    }
}
