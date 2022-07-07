package exercises;

import java.util.Scanner;

public class C10_Exercises {
    public static void main(String[] args) {
        //Kullanicidan baslangic ve bitis haflerini alin ve baslangic harfinden baslayip bitis
        //harfinde biten tum harfleri buyuk harf olarak ekrana yazdirin. Kullanicinin hata
        //yapmadigini farz edin.

        Scanner scan=new Scanner(System.in);
        System.out.print("Başlangıç HArfini Giriniz: ");
        char basHarf=scan.next().toUpperCase().charAt(0);
        System.out.print("Bitiş Harfini Giriniz: ");
        int bitisSHarf=scan.next().toUpperCase().charAt(0);

        for (char i = basHarf; i < bitisSHarf; i++) {

            System.out.print(i+" ");
        }
    }
}
