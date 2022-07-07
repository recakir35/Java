package day13_stringManipulation;

import java.util.Scanner;

public class C05_Execise {
    public static void main(String[] args) {
        //Kullanicidan isim isteyin Eger
        //- isim "a" harfi iceriyorsa “Girdiginiz isim a harfi iceriyor”
        //- isim "Z" harfi iceriyorsa “Girdiginiz isim Z harfi iceriyor”
        //- ikisi de yoksa “Girdiginiz isim a veya Z harfi icermiyor” yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Bir İsim Giriniz: ");
        String isim = scan.nextLine();

        if (isim.contains("a") && isim.contains("Z")) {
            System.out.println("Girdiğiniz isim hem a hemide Z harfi içeriyor.");
        } else if (isim.contains("a")) {
            System.out.println("Girdiğiniz isim a harfi içeriyor.");
        } else if (isim.contains("Z")) {
            System.out.println("Girdiğiniz isim Z harfi içeriyor.");
        } else System.out.println("Girdiginiz isim a veya Z harfi icermiyor");
    }
}
