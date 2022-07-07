package lesson06_ifElseStatements;

import java.util.Scanner;

public class C04_HaftaIciHaftaSonu {
    public static void main(String[] args) {
        //Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        //  Ornek:      gun=Pazar output = “Hafta sonu”
        //      gun=Sali output = “Hafta ici”
        //  *** String icin equals method’unu kullanin

        // pazar veya cumartesi ise ===> hafta sonu
        // pazartesi veya sali veya carsamba veya persembe veya cuma ise ==> hafta ici

        // String case sensitive'dir
        // yani pazar, PAZAR,Pazar, PAzar bunlar hep farkli kelimelerdir

        // bu durumda String methodlarindan yardim aliriz

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Gün ismini yazınız");
        String gunIsmi = scan.next().toLowerCase(); // Kullanıcı nasıl yazarsa yazsın biz küçük harfe çeviriyoruz.

        // String ifadelerde"==" kullanılması tavsiye edilmez
        // cunku bekledigimizden farkli sonuc verebilir

        if (gunIsmi.equals("pazar") || gunIsmi.equals("cumartesi")) {
            System.out.println("Girdiğiniz gün hafta sonu");
        }
        if (gunIsmi.equals("pazartesi") || gunIsmi.equals("salı") || gunIsmi.equals("çarşamba") || gunIsmi.equals("perşembe") || gunIsmi.equals("cuma")) {
            System.out.println("Girdiğiniz gün hafta içi");
        }


    }

}
