package lesson06_ifElseStatements;

import java.util.Scanner;

public class C05_IfElseHaftaninGunleri {
    public static void main(String[] args) {

        //Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        //  Ornek:      gun=Pazar output = “Hafta sonu”
        //      gun=Sali output = “Hafta ici”
        //  *** String icin equals method’unu kullanin
        // pazar veya cumartesi ise ===> hafta sonu
        // pazartesi veya sali veya carsamba veya persembe veya cuma ise ==> hafta ici

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Gün İsmini Giriniz");
        String gunIsmi= scan.next().toUpperCase();

        if (gunIsmi.equals("PAZAR")||gunIsmi.equals("CUMARTESİ")) {
            System.out.println("Girdiğiniz Gün Haftasonu");
        } else {
            System.out.println("Girdiğiniz Gün Haftaiçi");
        }
    }
}
