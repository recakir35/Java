package lesson02_Scanner;

import java.util.Scanner;

public class C02_CemberCevreDaireAlan {
    public static void main(String[] args) {

        //Soru 3) Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplayip yazdirin

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen cemberin yaricapini giriniz");
        double yaricap= scan.nextDouble();

        System.out.println("girdiginiz yaricap : " + yaricap);
        System.out.println("cemberin cevresi : " + 2*3.14*yaricap);
        System.out.println("dairenin alani : " + 3.14* yaricap*yaricap);
    }
}
