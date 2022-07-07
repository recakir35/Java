package lesson08_switch_StringManipulation;

import java.util.Scanner;

public class Q06_HarflerUnique {
    public static void main(String[] args) {

        /* TASK :
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 3 harfli isim Giriniz: ");
        String isim = scan.next();
        if (isim.length()==3) {
            String isimFarkli = (isim.charAt(0) == isim.charAt(1)) ? "1.Harfle 2.Harf Aynıdır" :
                    (isim.charAt(0) == isim.charAt(2)) ? "1.Harfle 3.Harf Aynıdır" :
                            (isim.charAt(1) == isim.charAt(2)) ? "2.Harfle 3.Harf Aynıdır" : "Unique isimdir";
            System.out.println(isimFarkli);
        } else System.out.println("Girdiğiniz isim Üç Harfli değil");

    }
}