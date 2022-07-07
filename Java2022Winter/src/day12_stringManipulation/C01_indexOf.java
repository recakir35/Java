package day12_stringManipulation;

import java.util.Scanner;

public class C01_indexOf {
    //Soru 2) Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki
    //kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
    //- Girilen kelime cumlede kullanilmamis.
    //- Girilen kelime cumlede 1 kere kullanilmis.
    //- Girilen kelime cumlede 1’den fazla kullanilmis.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Bir Cümle Giriniz: ");
        String cumle = scan.nextLine().toUpperCase();
        System.out.println("Lütfen Bir Kelime Giriniz: ");
        String kelime = scan.nextLine().toUpperCase();
        System.out.println("\n---- Girilen Cümle: " + cumle + ", Girilen Kelime: " + kelime + " --------");

        int ilkkullanim = cumle.indexOf(kelime);
        int ikincikullanim = cumle.indexOf(kelime, ilkkullanim + 1);

        if (ilkkullanim == (-1)) {
            System.out.println("\nGirilen Kelime Cümlede kullanılmamış");
        } else if (ikincikullanim == (-1)) {
            System.out.println("\nGirilen Kelime Cümlede 1 kere kullanılmış");
        } else System.out.println("\nGirilen Kelime Cümlede 1'den fazla kullanılmış");
    }
}
