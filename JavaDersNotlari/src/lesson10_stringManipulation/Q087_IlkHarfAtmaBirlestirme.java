package lesson10_stringManipulation;

import java.util.Scanner;

public class Q087_IlkHarfAtmaBirlestirme {

    //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi method kullanarak birlestiriniz.

    //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("String 1: ");
        String str1 = scan.nextLine();
        System.out.print("String 2: ");
        String str2 = scan.nextLine();

        System.out.println("Stringlerin 1.method ile birleşimi: " + str1 + " " + str2);
        System.out.println("Stringlerin 2.method ile birleşimi: " + str1.concat(" " + str2));

        String str1ilksiz=str1.substring(1);
        String str2ilksiz=str2.substring(1);
        System.out.println("Stringlerin İlk Harfsiz Yazımı: "+ str1ilksiz + " "+str2ilksiz);
    }
}
