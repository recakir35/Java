package day10_switch_StringManipulation;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class C06_ExerciseSayi {
    //Kullanicidan bir sayi girmesini isteyin
    //Girilen
    // sayi 10 ise “Iki basamakli en kucuk sayi
    //100 ise “uc basamakli en kucuk sayi”
    //1000 ise “dort basamakli en kucuk sayi”
    //diger durumlarda “Girdigin sayiyi degistir” yazdirin

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.print("Lütfen Bir Sayı Giriniz: ");

        int sayi= scan.nextInt();

        switch (sayi){
            case 10:
                System.out.println("İkibasamaklı En Küçük Sayı");
                break;
            case 100:
                System.out.println("uc basamakli en kucuk sayi");
                break;
            case 1000:
                System.out.println("dort basamakli en kucuk sayi");
                break;
            default :
                System.out.println("Girdigin sayiyi degistir");
        }
    }
}
