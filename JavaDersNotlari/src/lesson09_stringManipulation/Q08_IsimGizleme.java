package lesson09_stringManipulation;

import java.util.Scanner;

public class Q08_IsimGizleme {
    public static void main(String[] args) {
        //Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi
        //yazdirin isim soyisim M***** B******* kart no **** **** **** 1234

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen İsminizi Giriniz: ");
        String isim = scan.nextLine();
        System.out.print("Lütfen Soyisminizi Giriniz: ");
        String soyisim = scan.nextLine();
        System.out.print("Lütfen Kart Nosunu Giriniz: ");
        String kKNo = scan.nextLine();

        String yeniIsim = isim.substring(0, 1).toUpperCase() +
                isim.substring(1).replaceAll("\\S", "*");
        String yeniSoyisim = soyisim.substring(0, 1).toUpperCase() +
                soyisim.substring(1).replaceAll("\\S", "*");
        String yeniKKNo = "**** **** **** " + kKNo.substring(12);
        System.out.println("İsim Soyisim: " + yeniIsim + " " + yeniSoyisim);
        System.out.println("Kart No: " + yeniKKNo);
    }
}


