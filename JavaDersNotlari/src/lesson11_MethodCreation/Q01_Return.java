package lesson11_MethodCreation;

import java.util.Scanner;

public class Q01_Return {

    public static void main(String[] args) {

		/* TASK :
           String girildiginde ilk iki karakteri haric string return eden java method yaziniz
           Ancak ilk karakter 'g' veya ikinci karakteri 'h' ise bu karakterler de return edilsin
          ORNEK:
           INPUT      :  goat
                         photo
                         ghost
                         kalem
           OUTPUT :      gat
                         hoto
                         ghost
                         lem
		 */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir kelime giriniz: ");
        String kelime = scan.next();

        String ilkIkiharf = ilkIkiHarfHaric(kelime);

        System.out.println(ilkIkiharf);

    }

    public static String ilkIkiHarfHaric(String kelime) {
        String ikelime = "";

        if (kelime.substring(0, 2).equalsIgnoreCase("gh")) {
            ikelime = kelime;
        } else if (kelime.substring(0, 1).equalsIgnoreCase("g")) {
            ikelime = kelime.substring(0, 1) + kelime.substring(2);
        } else if (kelime.substring(1, 2).equalsIgnoreCase("h")) {
            ikelime = kelime.substring(1) ;
        } else ikelime = kelime.substring(2);

        return ikelime;
    }


}

