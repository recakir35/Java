package lesson06_ifElseStatements;

import java.util.Scanner;

public class Q07_OdevKareDikdortgen {
    public static void main(String[] args) {
        //Soru 4) Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve dikdortgenin kare olup
        //olmadigini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Dikdörtgenin Kenar Uzunluklarını Giriniz:");
        double kenar1 = scan.nextDouble();
        double kenar2 = scan.nextDouble();

        if (kenar1 < 0 || kenar2 < 0) {
            System.out.println("Lütfen Pozitif Sayı Giriniz");
        } else if (kenar1 == kenar2) {
            System.out.println("Girdiğiniz Kenarlar ile bir KARE oluşturursunuz");
        } else System.out.println("Girdiğiniz Kenarlar ile dikdörtgen oluşturursunuz");

    }
}
