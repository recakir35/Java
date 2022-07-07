package practice_free2;

import java.util.Scanner;

public class Q14_CümledeHarfKacKez {
    /*
     * Kullanicidan bir cumle ve bir harf alin,
     * Cumlede harfin kac kere
     * kullanildigini bulup, yazdirin
     *
     * ORNEK:
     *
     * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
     *
     * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen Bir Cümle giriniz: ");
        String kelime=scan.nextLine();
        System.out.print("Lütfen Bir Harf giriniz: ");
        String harf=scan.next();
        int sayac=0;

        for (int i = 1; i <=kelime.length() ; i++) {
            if (kelime.substring(i-1,i).equalsIgnoreCase(harf)) {
                sayac++;
            }
        }
        System.out.println(kelime +" > cümlesinde <"+ harf + "> harfi "+ sayac+" kez vardır." );
    }
}
