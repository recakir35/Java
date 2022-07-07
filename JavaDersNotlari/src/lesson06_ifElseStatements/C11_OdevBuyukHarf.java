package lesson06_ifElseStatements;

import java.util.Scanner;

public class C11_OdevBuyukHarf {
    public static void main(String[] args) {
        //Soru 11: Nested If kullanarak asagidaki soruyu cozen kodu yaziniz
        //Kullanicidan bir sifre girmesini isteyin
        //Eger ilk harf buyuk harf ise “A" olup olmadigini kontrol edin Ilk harf A ise
        //“Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin
        //Eger ilk harf kucuk harf ise “z" olup olmadigini kontrol edin Ilk harf z ise
        //“Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Bir Şifre Giriniz: ");
        String sifre = scan.next();

        if (sifre.charAt(0)=='A' || sifre.charAt(0)=='z') {
            System.out.println("GeçerLİ Şifre");
        }else System.out.println("GeçerSİZ Şifre");

    }
}
