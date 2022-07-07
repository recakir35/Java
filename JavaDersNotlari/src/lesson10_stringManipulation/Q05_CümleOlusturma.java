package lesson10_stringManipulation;

import java.util.Scanner;

public class Q05_CümleOlusturma {
    /*
     * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
     *
     * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
     *         Output : Cesaret insana sinirlarini ogretir.
     *
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen 1.Kelimeyi Giriniz: ");
        String kelime1=scan.next();
        System.out.print("Lütfen 2.Kelimeyi Giriniz: ");
        String kelime2=scan.next();
        System.out.print("Lütfen 3.Kelimeyi Giriniz: ");
        String kelime3=scan.next();
        System.out.print("Lütfen 4.Kelimeyi Giriniz: ");
        String kelime4=scan.next();

        System.out.println("\n---> "+kelime1.concat(" ").concat(kelime2).concat(" ").concat(kelime3).concat(" ").concat(kelime4).concat("."));

    }
}
