package day08_ifElseIfStatements;

import java.util.Locale;
import java.util.Scanner;

public class C09_OdevGunIsmi {
    public static void main(String[] args) {
        //Soru 5) Kullanicidan gun ismini yazmasini isteyin. Girilen isim gecerli bir gun ise gun
        //isminin 1.,2. ve 3.harflerini ilk harf buyuk diger ikisi kucuk olarak yazdirin, gun ismi
        //gecerli degilse “Gecerli gun ismi giriniz” yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Gün İsmi Yazınız: ");
        String gunIsmi= scan.next().toUpperCase(Locale.ROOT);
        System.out.println(gunIsmi);
        //if (gunIsmi==)
    }
}
