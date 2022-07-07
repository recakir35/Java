package replit;

import java.util.Scanner;

public class TR_Scanner_6 {
    public static void main(String[] args) {
        //Kullanıcıdan bir Float değer girmesini isteyin, bu sayıyı short değişken tipine dönüştürün ve konsolda yazdırın.
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen Bir Float Sayı Giriniz: ");
        float sayi=scan.nextFloat();
        System.out.println((int)sayi);
    }
}
