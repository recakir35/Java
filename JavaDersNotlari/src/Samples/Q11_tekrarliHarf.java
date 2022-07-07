package practice_free2;

import java.util.Scanner;

public class Q11_tekrarliHarf {
    /*
     * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
     * return eden metod yaziniz
     *
     * ornek:  input            output
     *         elma  2           eaea
     *         army  3           ayayay

     */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen Bir Kelime giriniz: ");
        String kelime=scan.nextLine();
        System.out.print("Bu kelimenin ilk ve son harfini kaç kez yazdirayim: ");
        int kacKez=scan.nextInt();

        System.out.println(ilkSonHarfTekrariYazdir(kelime, kacKez));

    }

    private static String ilkSonHarfTekrariYazdir(String kelime, int kacKez) {
        String tekrarHarf="";

        tekrarHarf=kelime.substring(0,1)+kelime.substring(kelime.length()-1);
        for (int i = 1; i <kacKez-1 ; i++) {
            tekrarHarf+=tekrarHarf;
        }

        return tekrarHarf;
    }
}
