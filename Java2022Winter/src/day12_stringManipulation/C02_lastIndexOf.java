package day12_stringManipulation;

import java.util.Scanner;

public class C02_lastIndexOf {
    public static void main(String[] args) {
        //Soru 2) Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki
        //kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
        //- Girilen kelime cumlede kullanilmamis.
        //- Girilen kelime cumlede 1 kere kullanilmis.
        //- Girilen kelime cumlede 1’den fazla kullanilmis.

            Scanner scan = new Scanner(System.in);
            System.out.println("Lütfen Bir Cümle Giriniz: ");
            String cumle = scan.nextLine().toUpperCase();
            System.out.println("Lütfen Bir Kelime Giriniz: ");
            String kelime = scan.nextLine().toUpperCase();
            System.out.println("\n---- Girilen Cümle: " + cumle + ", Girilen Kelime: " + kelime + " --------");

            int ilkkullanim = cumle.indexOf(kelime);
            int sonkullanim = cumle.lastIndexOf(kelime);

            if (ilkkullanim == -1){
                System.out.println("\nGirilen Kelime Cümlede kullanılmamış");
            }else if(ilkkullanim==sonkullanim){
                System.out.println("\nGirilen Kelime Cümlede 1 kere kullanılmış");
            }else System.out.println("\nGirilen Kelime Cümlede 1'den fazla kullanılmış");

            String str="Eclipse";
        System.out.println(str.lastIndexOf("p",4));

    }
}
