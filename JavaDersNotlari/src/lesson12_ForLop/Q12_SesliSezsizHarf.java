package lesson12_ForLop;

import java.util.Scanner;

public class Q12_SesliSezsizHarf {
    /*Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
 değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
 1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
 Sesli harfler: a,e,i,o,u

 Test Data:
 a
 Beklenen Çıktı:
 a harfi sesli harfdir.

 Test Data:
 d
 Beklenen Çıktı:
 d harfi sesiz harftir.

 Test Data:
 we  yada  %

 Beklenen Çıktı:
 Yanlis karakter girdiniz!

  */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Bir Harf Giriniz: ");
        char harf = scan.next().charAt(0);
        boolean sesliHarfMi = false;

        String sesliHarfler = "aeıioöuüAEIİOÖUÜ";
        if (harf >= 'A' && harf <= 'z') {

            for (int i = 0; i < sesliHarfler.length(); i++) {
                if (harf == sesliHarfler.charAt(i)) {
                    sesliHarfMi = true;
                }
            }
            if (sesliHarfMi == false) {
                System.out.println("Girdiğiniz Harf Sessiz Harftir");
            } else System.out.println("Girdiğiniz Harf Sesli Harftir");
        } else System.out.println("Lütfen bir harf giriniz");
    }
}

