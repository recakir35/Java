package lesson10_stringManipulation;

import java.util.Scanner;

public class Q02_KelimeninOrtasiniYazdir {
    /*
		Kullanicidan bir kelime girmesini isteyin.
		* Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
		* kelimenin ortasindaki karakteri yazdirin.
		*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen Bir kelime giriniz: ");
        String kelime=scan.nextLine();
        int kelimeOrtasi=(kelime.length()-1)/2;

        if (kelime.length()<3){
            System.out.println("Kelime 3'den daha az karakter içeriyor");
        }else if(kelime.length()%2!=0){
            System.out.println("Kelime Teksayıda Karakteri İçerdeiğinden Kelime Ortasındaki Karakter: "+kelime.substring(kelimeOrtasi,kelimeOrtasi+1));
        }else System.out.println("Kelime çiftsayıda Karakteri İçeriyor ");
    }
}