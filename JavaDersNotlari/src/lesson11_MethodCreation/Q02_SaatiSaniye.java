package lesson11_MethodCreation;

import java.util.Scanner;

public class Q02_SaatiSaniye {
    public static void main(String[] args) {

/*      TASK :
        Saati saniyeye, mil'i kilometreye, kilogrami gram'a
        ceviren bir method yaziniz.

 */
        Scanner scan=new Scanner(System.in);
        System.out.print("Çevirim yapacağınız işlemi seçimiz: ");
        String islem=scan.next();
        System.out.print("Çevirim Miktarını Giriniz: ");
        double miktar=scan.nextDouble();

        donustur(islem,miktar);

    }

    private static void donustur(String islem, double miktar) {
        switch (islem){
            case "saat":
                System.out.println(miktar+ " Saat "+(miktar*60*60)+ " Saniyedir.");
                break;
            case "mil":
                System.out.println(miktar + " Mil "+ (miktar*1.61)+" Km. dir." );
                break;
            case "kg":
                System.out.println(miktar+" kg "+ (miktar*1000)+ " gr. dır");
                break;
                default:
                    System.out.println("yanlış işlem girdiniz.");
        }
    }
}

